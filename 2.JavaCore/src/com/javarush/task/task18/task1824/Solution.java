package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        while (true) {
            try {
                fileName = reader.readLine();
                FileInputStream inputStream = new FileInputStream(fileName);
                inputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }

        reader.close();
    }
}
