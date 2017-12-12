package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        while (br.ready()) {
            String stroka = br.readLine();
            if (stroka.startsWith(args[0])) System.out.println(stroka);
        }
        reader.close();
        br.close();
    }
}
