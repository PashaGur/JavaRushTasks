package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        String result = "";
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            set.add(data);
        }
        list.addAll(set);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + " ";
        }
        System.out.println(result);
        reader.close();
        fileInputStream.close();
    }

}
