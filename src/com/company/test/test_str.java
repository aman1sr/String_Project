package com.company.test;

public class test_str {



    public static void main(String[] args) {
        String str = "my name is khan";

//        string_Read_WordByWord();

//        trim_str();

//        set_StrNull();

//        strSplit();

        subString(str);

    }

    private static void subString(String str) {

        String str2 = str.substring(3);
//        str2 = str.substring(8);


        System.out.println(str2);

    }


    private static void strSplit() {

        String str = "my name is khan";

        String[] str2 = str.split("\\s");

//        System.out.println(str2[2]);

        for (String str3 : str2) {
            System.out.print(str3+", ");
        }
    }

    private static void set_StrNull() {

        String str = "";
        String str2 = null;

        char ch = 'a';

        str = str + String.valueOf(ch);

        str2 = str2 + String.valueOf(ch);

        System.out.println("str:"+ str);
        System.out.println("str2:"+ str2);

    }

    private static void trim_str() {
        String str1 = " how ";
        String str2 = "  are";
        String str3 = "  you ";

//        str1.trim();  ,, this will not change the value of str1,, u have to explicitlly reference it to other string,,

        System.out.println(str1.trim()+str2+str3.trim());
    }

    private static void string_Read_WordByWord() {
        String str = "My Name is Khan";

        String str1=null;

        for (char ch : str.toCharArray()) {
//            System.out.print(ch+", ");

            if (str1 == null) {
                str1 = String.valueOf(ch);
            } else {
                str1 = str1+ String.valueOf(ch);
            }


        }
        System.out.println(str1);

    }
}
