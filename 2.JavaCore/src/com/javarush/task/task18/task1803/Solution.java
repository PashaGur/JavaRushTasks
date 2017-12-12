package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        long[] arrBytes = new long[256];

        while (inputStream.available() > 0) arrBytes[inputStream.read()]++;
        inputStream.close();

        for (int i = 0; i < 256; i++) {
            if (arrBytes[i] > 2)
                System.out.print(i + " ");
        }
    }
}