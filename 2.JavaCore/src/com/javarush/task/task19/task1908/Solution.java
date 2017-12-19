package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        Pattern pat = Pattern.compile("\\b\\d+\\b"); //поиск целых чисел
        String str = null;

        while (fileReader.ready()) {
            str = fileReader.readLine();
            Matcher mat = pat.matcher(str);
            while (mat.find()) {
                fileWriter.write(mat.group() + " ");
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
