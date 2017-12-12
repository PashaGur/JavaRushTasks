package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read();
            if (data>64 && data< 91 || data>96 && data < 123) count++;

        }
        System.out.println(count);

        inputStream.close(); //закрываем оба потока. Они больше не нужны.

    }

}

