package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String ,String> map = new HashMap<>();
        map.put("Вася", "Пупкин1");
        map.put("Вася1", "Пупкин");
        map.put("Вася2", "Пупкин2");
        map.put("Вася3", "Пупкин3");
        map.put("Вася", "Пупкин4");
        map.put("Вася4", "Пупкин");
        map.put("Вася5", "Пупкин5");
        map.put("Вася6", "Пупкин6");
        map.put("Вася7", "Пупкин7");
        map.put("Вася8", "Пупкин8");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
