package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String URL=new BufferedReader(new InputStreamReader(System.in)).readLine().replaceAll("^(.*\\?)","");
            //Создаем URL. Считываем. Обрезаем всё что до знака вопроса (включительно)
            for (String s: URL.split("\\&+"))System.out.print(s.replaceAll("\\=.*$","")+" ");
            // Сплитим строки по символу & и сразу по этим строкам пробегаемся через for-each.
            // заменяет от знака равно(=) до конца проверяемой строки на пробел и выводит это на экран
            System.out.println(); // переход на новую строку
            for(String s:URL.split("\\&+")){ // Опять сплитим строки по символу & и сразу по этим строкам пробегаемся через for-each.
                if(s.replaceAll("\\=.*$","").equals("obj")){ // после обрезания :) проверяем, если строка - obj.
                   try{ alert(Double.parseDouble(s=s.replaceAll("^([^=])*\\=","")));
                    //Обрезаем левую часть до первого знака "равно" (включительно), остаток присваиваем в s.
                } catch (NumberFormatException r){
                       alert(s);
                   }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
