package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String fileName;
        byte [] buffer;
        while (true) {
            fileName = reader.readLine();
            if (fileName.equals("end")) break;
            list.add(fileName);
        }
        Collections.sort(list);
        String finalName = list.get(0).substring(0,list.get(0).lastIndexOf("."));
        FileOutputStream outputStream = new FileOutputStream(finalName);
        for (String file : list) {
            FileInputStream inputStream = new FileInputStream(file);
            if(inputStream.available() > 0){
                buffer = new byte[inputStream.available()];
                inputStream.read(buffer);
                outputStream.write(buffer);
            }
            inputStream.close();
        }
        reader.close();
        outputStream.close();
    }
}
