package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName.readLine()));
        Pattern pattern = Pattern.compile("\\bworld\\b");

        int count = 0;
        while (fileReader.ready()) {
            Matcher matcher = pattern.matcher(fileReader.readLine());
            while (matcher.find()) count++;
        }

        System.out.println(count);
        fileName.close();
        fileReader.close();
    }
}
