package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream(args[0]);
        double spaces = 0;
        double others = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (data == 32) spaces++;
            else others++;
        }
        inputStream.close();
        System.out.println(String.format("%.2f", spaces/others*100));
    }
}
