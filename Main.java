package com.lyashuk.homework1;

/**
 * Created by root on 26.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = strSplit("kabriolet");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }


    public static String[] strSplit(String value) {
        String vowel = "aeoiuy";
        String result = "";
        char[] arr = value.toCharArray();

        for (char letter : arr) {
            if (!vowel.contains(String.valueOf(letter))) {
                result += letter;
            } else {
                result += letter + ",";
            }
        }
        /*if (!vowel.contains(String.valueOf(arr[arr.length - 1]))) {

        }*/
        return result.split(",");

       /* for (int i = 0; i < arr.length; i++) {
            if(vowel.contains(String.valueOf(arr[i]))){
                result+= value;
          }
        }*/
    }

}


