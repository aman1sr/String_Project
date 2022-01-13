package com.company;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

//        final String string = "my name is khan";
//        final String string = "my name is is khan";

        final String string = "How are you !You GOOD 88 #@ ";

        final String str1 = "aman";
        final String str2 = "ram";

//        rev_String1(string);

//        panimdrome();

//        capitalise_EachWord(string,string.length());

//        toggle_Send(string);

//        swapString(str1,str2);

//        removeParChar(string);

//        countWords(string);

//        removeSpace(string);

//        panimdrome2();

//        checkingDubWords(string);

//        findingPer(string);


    }

    private static void findingPer(String string) {

        int countUPch =0;
        int countLWch =0;
        int countDGch =0;
        int countSPch =0;

        System.out.println("STRING: "+ string);

        for (char ch : string.toCharArray()) {

            if (ch == ' ') {            // if not included this,, the spcial char Count is reading white spaces also.
                continue;
            }

            if (Character.isUpperCase(ch)) {
                countUPch++;
            } else if (Character.isLowerCase(ch)) {
                countLWch++;
            } else if (Character.isDigit(ch)) {
                countDGch++;
            }  else {
                countSPch++;
            }
        }

        System.out.println(" upper char: "+ countUPch);
        System.out.println(" lower char: "+ countLWch);
        System.out.println(" digit char: "+ countDGch);
        System.out.println(" special@#$ char: "+ countSPch);

    }

    private static void checkingDubWords(String string) {

        String[] str = string.split("\\s");

        if (StrMethod.checkingdublicate(str)) {
            System.out.println("Yes dublicate exist");
        } else {
            System.out.println("No.");
        }

    }

    private static void panimdrome2() {
//        String str = "nitin";
//        String str2 = "jatin";

        String str = "avajava";
        String str2 = "avajava";

        System.out.println("checking if " + str + " is rotation of " + str2 + " or not");

        if (StrMethod.checkingStrRoatate(str, str2)) {
            System.out.println("YEs");
        } else {
            System.out.println("Nope.");
        }

    }

    private static void removeSpace(String string) {

        System.out.println("initially string: " + string);

        System.out.println("final String: ");
        for (String str : string.split("\\s")) {
            System.out.print(str);
        }

    }

    private static void countWords(String string) {

        String[] str = string.split("\\s");

        System.out.println("length of string: " + str.length
        );

    }

    private static void removeParChar(String string) {
        char ch;
        System.out.println("initially the STring is: " + string);
        System.out.println("Enter the letter to remove");
        ch = sc.next().charAt(0);

        String str2 = "";
        for (char ch1 : string.toCharArray()) {

            if (ch1 == ch) {
                continue;
            } else {
                str2 = str2 + ch1;
            }

        }

        System.out.println("final string is: " + str2);


    }

    private static void swapString(String str1, String str2) {

        System.out.println("string 1 & 2: " + str1 + " , " + str2);
        str2 = str1 + str2;

        str2 = str2.substring(str2.length() - str1.length() + 1);

        System.out.println("final string 1 & 2: " + str1 + " , " + str2);

    }

    private static void toggle_Send(String string) {

        String[] str = string.split("\\s");
        String finalStr = "";
        for (String str2 : str) {

            finalStr = finalStr + " " + StrMethod.toggle(str2.trim());

        }
        System.out.println("final toggle string: " + finalStr);

    }

    private static void capitalise_EachWord(String str, int len) {

        String str2 = "";
        String str3 = "";

        for (int i = 0; i < len; i++) {

            str2 = str2 + String.valueOf(str.charAt(i));

            if (str.charAt(i) == ' ' || i == len - 1) {

                str3 = str3 + " " + StrMethod.capStr_1stLetter(str2.trim());

                str2 = "";
            }

        }
        System.out.println("final String: " + str3);

    }

    private static void panimdrome() {

        boolean panim = true;
//        String str = "nitin";
        String str = "jatin";

        int endpoint = str.length() - 1;
        int startponit = 0;
        int limit;

        if (str.length() % 2 == 0) {
            limit = str.length() / 2 + 1;
        } else {
            limit = str.length() / 2;
        }


        while (startponit < limit) {

            if (str.charAt(startponit) != str.charAt(endpoint)) {
                panim = false;
                break;
            }
            startponit++;
            endpoint--;

        }
        System.out.println("is " + str + " paninDrome: " + panim);

    }

    private static void rev_String1(String string) {
        String str = null;       // to store words
        String str2 = null;         // to store the entire final  rev. String

        int i = 0;
        for (char ch : string.toCharArray()) {
            i++;
            if (str == null) {
                str = String.valueOf(ch);
            } else {
                str = str + String.valueOf(ch);
            }

            if (ch == ' ' || i == string.length()) {
                if (str2 != null) {
                    str2 = StrMethod.revStr(str.trim()) + " " + str2;
                } else {
                    str2 = StrMethod.revStr(str.trim());
                }
                str = null;
            }
        }
        System.out.println("New updated Rev string: " + str2);
    }

}
