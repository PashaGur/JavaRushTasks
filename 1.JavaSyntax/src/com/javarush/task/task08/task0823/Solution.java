package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char symbols[] = s.toCharArray(); // Переводит строку в массив символов
        symbols[0] = Character.toUpperCase(symbols[0]);
        for (int i = 1; i<symbols.length; i++){
            if (symbols[i-1] == ' '){
                symbols[i] = Character.toUpperCase(symbols[i]);
            }
        }
        System.out.println(symbols);



        //напишите тут ваш код
    }
}
