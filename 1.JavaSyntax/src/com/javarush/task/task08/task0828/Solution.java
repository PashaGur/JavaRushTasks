package com.javarush.task.task08.task0828;

import java.awt.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;
import java.util.regex.*;

class Solution
{
    public static void main (String[] args) throws IOException {
        System.out.println("Введите число");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            fact*= i;
            sum+= fact;
        }
        System.out.println(sum);
    }
}
