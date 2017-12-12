package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream3 = new FileOutputStream(reader.readLine());
        int a = inputStream.available();
        byte[] buffer2 = new byte[inputStream.available()];
        byte[] buffer3 = new byte[inputStream.available()];
        if (a % 2 == 0) {
            buffer2 = new byte[inputStream.available() / 2];
            buffer3 = new byte[inputStream.available() - buffer2.length];
            inputStream.read(buffer2);
            inputStream.read(buffer3);
        } else if (a % 2 != 0) {
            buffer2 = new byte[inputStream.available() / 2 + 1];
            buffer3 = new byte[inputStream.available() - buffer2.length];
            inputStream.read(buffer2);
            inputStream.read(buffer3);
        }

        outputStream2.write(buffer2);
        outputStream3.write(buffer3);

        reader.close();
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
