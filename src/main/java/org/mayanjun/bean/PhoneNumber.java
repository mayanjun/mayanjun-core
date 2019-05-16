package org.mayanjun.bean;

import org.mayanjun.enums.MobileOperator;

/**
 * @author mayanjun
 * @since 2018/7/7
 */
public class PhoneNumber extends Message {

    private String number;

    private MobileOperator operator;

    private String regionNumber;

    private String phoneNumber;

    public PhoneNumber(String number) {
        this.number = number;
    }

    public PhoneNumber(int code, String description, Throwable exception) {
        super(code, description, exception);
    }

    public PhoneNumber(int code, String description) {
        super(code, description);
    }

    public PhoneNumber() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MobileOperator getOperator() {
        return operator;
    }

    public void setOperator(MobileOperator operator) {
        this.operator = operator;
    }

    public String getRegionNumber() {
        return regionNumber;
    }

    public void setRegionNumber(String regionNumber) {
        this.regionNumber = regionNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                ", operator=" + operator +
                ", regionNumber='" + regionNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
