package org.mayanjun.util;

import org.mayanjun.bean.PhoneNumber;
import org.mayanjun.core.Assert;
import org.mayanjun.core.ServiceException;
import org.mayanjun.enums.MobileOperator;

/**
 * @author mayanjun
 * @since 2018/7/6
 */
public class ChinesePhoneNumberParser extends AbstractParser<String, PhoneNumber> {

    private int mobileNumberLength = 11;

    @Override
    protected PhoneNumber doParse(String input) {
        // remove white space
        char cs[] = input.toCharArray();
        PhoneNumber number = new PhoneNumber(input);
        char cs0 = cs[0];
        switch (cs0) {
            case '0':
                number.setOperator(MobileOperator.CHINA_TELECOM);
                parseRegionNumber(number, cs);
                break;
            case '1':
                validateMobileNumber(cs);
                number.setOperator(MobileOperator.getMobileOperator(String.valueOf(cs, 0, 3)));
                break;
        }
        return number;
    }

    private void validateMobileNumber(char[] cs) {
        Assert.isTrue(cs.length == mobileNumberLength, "手机号码长度必须是" + mobileNumberLength + "位");
        for (char c : cs) {
            if (!Character.isWhitespace(c)) {
                if (!Character.isDigit(c)) throw new ServiceException("号码中含有非数字字符");
            }
        }
    }

    private void parseRegionNumber(PhoneNumber number, char[] cs) {
        StringBuffer rn = new StringBuffer();
        StringBuffer pn = new StringBuffer();
        boolean numberBegin = false;
        for (char c : cs) {
            if (Character.isDigit(c)) {
                if (numberBegin) pn.append(c);
                else rn.append(c);
            } else {
                numberBegin = true;
            }
        }
        number.setRegionNumber(rn.toString());
        number.setPhoneNumber(pn.toString());
    }

    public int getMobileNumberLength() {
        return mobileNumberLength;
    }

    public void setMobileNumberLength(int mobileNumberLength) {
        this.mobileNumberLength = mobileNumberLength;
    }

    public static void main(String[] args) {
        System.out.println(
                new ChinesePhoneNumberParser().parse("1880370490")
        );
    }
}
