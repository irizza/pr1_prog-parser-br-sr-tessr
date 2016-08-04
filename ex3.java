package com.lyashuk.homework1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by root on 26.05.2016.
 */
public class ex3 {


    public static void main(String[] args) throws IOException {
        String str = new String(Files.readAllBytes(Paths.get("baby2008.html")));
        test1(str);
    }

/*        <tr align="right"><td>3</td><td>Ethan</td><td>Emily</td>*/

    public static void test1(String s) {

        Pattern p = Pattern.compile("<tr align=\"right\"><td>\\d*</td><td>.*</td><td>.*</td>\n" + "</tr>");
        Matcher m = p.matcher(s);
        while (m.find()) {

            System.out.println(m.group());

/*
            ArrayList<Baby> b = new ArrayList<Baby>();
            b.add(new Baby(p.matcher(s)));*/
        }


    }
}