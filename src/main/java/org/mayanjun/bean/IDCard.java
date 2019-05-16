package org.mayanjun.bean;

import org.mayanjun.core.Status;
import org.mayanjun.enums.Gender;

import java.util.Date;

/**
 * Represents an Id card
 *
 * @author mayanjun
 */
public class IDCard extends Message {

    public static Status CODE_NUMBER_EMPTY = new Status(2018001, "身份证号为空");
    public static Status CODE_NUMBER_ERROR = new Status(2018002, "身份证号错误");
    public static Status CODE_BIRTHDATE_ERROR = new Status(2018003, "出生日期错误");
    public static Status CODE_PROVINCE_ERROR = new Status(2018004, "地区编码错误");
    public static Status CODE_CHECKSUM_ERROR = new Status(2018005, "身份证无效，最后一位错误");

    private String number;
    private Gender gender;
    private String province;
    private String provinceCode;
    private int generation;
    private Date birthdate;
    private String number2;

    public IDCard() {
        super(Status.OK.getCode(), "OK");
    }

    public IDCard(int code) {
        super(code, "");
    }

    public IDCard(String number, Gender gender, String province, String provinceCode, int generation, Date birthdate, String number2) {
        super(Status.OK.getCode(), "OK");
        this.number = number;
        this.gender = gender;
        this.province = province;
        this.provinceCode = provinceCode;
        this.generation = generation;
        this.birthdate = birthdate;
        this.number2 = number2;
    }

    public String getIDCardNumber() {
        return number;
    }

    public String getProvince() {
        return province;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public int getGeneration() {
        return generation;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getNumber2() {
        return number2;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "number='" + number + '\'' +
                ", gender=" + gender +
                ", province='" + province + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", generation=" + generation +
                ", birthdate=" + birthdate +
                ", number2='" + number2 + '\'' +
                '}';
    }
}