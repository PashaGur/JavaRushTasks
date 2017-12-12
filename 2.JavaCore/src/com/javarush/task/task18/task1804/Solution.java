package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        try{
            while (fis.available() > 0) {
                map.merge(fis.read(),1,Integer::sum); //сразу добавляем в map и увеличиваем счетчик
            }
            map.forEach((integer, integer2) -> {
                if (integer2 == Collections.min(map.values())) System.out.print(integer + " ");
            });
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
        }
    }
}
