package com.lyashuk.homework1;

/**
 * Created by root on 26.05.2016.
 */
public class ex2 {
    public static void main(String[] args) {
        int size = 10000;
        String s= "";
        for (int i = 0; i <size*10 ; i++) {

            s+="a";

        }

        strConcat(size);
        strConcatPlus(size);
        strBuffer(size);
        strBuilder(size);
        System.out.println();





    }


    public static void strConcat(int size) {

        long start = System.currentTimeMillis();
        /*to-do*/
        String s = "a";
        for (int i = 0; i <size ; i++) {

            s=s.concat("a");

        }

        long finish = System.currentTimeMillis();
        long diff = finish - start;
        System.out.println("StrConcat:  " + diff);

    }

    public static void strConcatPlus(int size) {

        long start = System.currentTimeMillis();
        /*to-do*/
        String s = "a";
        for (int i = 0; i <size ; i++) {

            s+="a";

        }

        long finish = System.currentTimeMillis();
        long diff = finish - start;
        System.out.println("StrConcatPlus:  " + diff);

    }

    public static void strBuilder(int size) {

        long start = System.currentTimeMillis();
        /*to-do*/
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i <size ; i++) {
          sb.append("a");

        }

        long finish = System.currentTimeMillis();
        long diff = finish - start;
        System.out.println("StrBuilder:  " + diff);

    }
    public static void strBuffer(int size) {

        long start = System.currentTimeMillis();
        /*to-do*/
        StringBuffer sf = new StringBuffer("a");
        for (int i = 0; i <size ; i++) {
            sf.append("a");

        }

        long finish = System.currentTimeMillis();
        long diff = finish - start;
        System.out.println("StrBuffer:  " + diff);

    }
}
