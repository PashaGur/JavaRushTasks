package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufReader.readLine();
        String fileName2 = bufReader.readLine();
        bufReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        while (reader.ready()){
            String s = reader.readLine();
            writer.write(s.replaceAll("\\.", "!"));
        }
        reader.close();
        writer.close();

    }
}
