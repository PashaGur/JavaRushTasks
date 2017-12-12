package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];
        byte[] buffer2 = new byte[inputStream.available()];
        inputStream.read(buffer);
        int a = 0;
        for (int i = buffer.length - 1; i >= 0; i--) {
            buffer2[a] = buffer[i];
            a++;
        }
        outputStream.write(buffer2);
        inputStream.close();
        outputStream.close();

    }
}
