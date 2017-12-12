package com.javarush.task.task18.task1818;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        FileInputStream inputStream2 = new FileInputStream(filename2);
        FileInputStream inputStream3 = new FileInputStream(filename3);
        FileOutputStream outputStream = new FileOutputStream(filename1, true);
        if (inputStream2.available() > 0) {
            byte[] buffer = new byte[inputStream2.available()];
            inputStream2.read(buffer);
            outputStream.write(buffer);
        }
        inputStream2.close();
        if (inputStream3.available() > 0) {
            byte[] buffer = new byte[inputStream3.available()];
            inputStream3.read(buffer);
            outputStream.write(buffer);
        }
        inputStream3.close();
        outputStream.close();
    }
}
