package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date inputTime = new Date(date);
        Date startTime = new Date("JAN 1 " + inputTime.getYear());
        long days = (inputTime.getTime() - startTime.getTime()) / 1000 / 60 / 60 / 24;
        System.out.println(days);
        return days % 2 == 0;
    }
}