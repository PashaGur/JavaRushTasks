package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName1);
        while (fileReader.ready()) {
            int data = fileReader.read();
            list.add(data);
        }
        fileReader.close();
        FileWriter fileWriter = new FileWriter(fileName2);
        for (int i = 1; i < list.size(); i += 2) {
            fileWriter.write(list.get(i));
        }
        fileWriter.close();
    }
}
