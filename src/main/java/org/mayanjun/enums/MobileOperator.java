package org.mayanjun.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mayanjun
 * @since 2018/7/7
 */
public enum MobileOperator {

    UNKNOWN,
    CHINA_UNICOME("130", "131", "132", "155", "156", "185", "186"),
    CHINA_TELECOM("133", "153", "180", "189"),
    CMCC("134", "135", "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "187", "188");

    private static Map<String, MobileOperator> OPERATORS_INDEX = new HashMap<String, MobileOperator>();

    static {
        MobileOperator operators[] = MobileOperator.values();
        for (MobileOperator mo : operators) {
            for(String p : mo.numberPrefixes) OPERATORS_INDEX.put(p, mo);
        }
    }

    public static MobileOperator getMobileOperator(String number) {
        String num = number;
        if (num.length() > 3) num = num.substring(0, 3);
        MobileOperator operator = OPERATORS_INDEX.get(num);
        if (operator != null) return operator;
        return MobileOperator.UNKNOWN;
    }

    private String numberPrefixes[];

    MobileOperator(String ... numberPrefixes) {
        this.numberPrefixes = numberPrefixes;
    }

    public String[] getNumberPrefixes() {
        return numberPrefixes;
    }
}
