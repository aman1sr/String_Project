package com.company;

import java.util.Locale;

public class StrMethod {

    public static String  revStr(String str) {
        String str2 = null;

        for (char ch : str.toCharArray()) {
            if (str2 != null) {
                str2 = String.valueOf(ch) + str2;
            } else {
                str2 = String.valueOf(ch);
            }

        }

        return str2;
    }

    public static String capStr_1stLetter(String str) {
        String str2 = "";

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == 0) {
                str2 = String.valueOf(ch);
                str2 = str2.toUpperCase(Locale.ROOT);
            } else {
                str2 = str2+ch;
            }

        }

        return str2;
    }

    public static String toggle(String str) {


        return str;
    }

    public static boolean checkingStrRoatate(String str1, String str2) {

        if (str2.length() != str1.length()) {
            return false;
        }

        if (str1.contains(str2)) {
            return true;
        } else {
            return false;
        }


    }

    public static boolean checkingdublicate(String[] str) {
boolean doExist = false;
        int k=1;
        for (String str2 : str) {

            for (int i=k; i < str.length; i++) {
                if (str2.equalsIgnoreCase(str[i])) {
                    System.out.println("dublicate string: "+ str2);
                doExist = true;
                }
            }

            k++;
        }

        return doExist;
    }
}
