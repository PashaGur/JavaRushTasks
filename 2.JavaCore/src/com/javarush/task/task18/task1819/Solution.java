package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileInputStream inputStream2 = new FileInputStream(fileName2);
        byte[] buffer1 = new byte[inputStream1.available()];
        byte[] buffer2 = new byte[inputStream2.available()];
        //byte[] buffer3 = new byte[inputStream1.available() + inputStream2.available()];
        if (inputStream1.available() > 0) {
            inputStream1.read(buffer1);
        }
        inputStream1.close();
        FileOutputStream outputStream = new FileOutputStream(fileName1);
        outputStream.close();
        FileOutputStream outputStream1 = new FileOutputStream(fileName1,true);
        if (inputStream2.available() > 0) {
            inputStream2.read(buffer2);
        }
        inputStream2.close();
        outputStream1.write(buffer2);
        outputStream1.write(buffer1);
        /*for (int i = 0; i < buffer2.length; i++) {
            buffer3[i] = buffer2[i];
        }
        for (int i = buffer2.length; i < buffer3.length; i++) {
            buffer3[i] = buffer1[i - buffer2.length];
        }
        outputStream1.write(buffer3);
        */
        outputStream1.close();
    }
}
