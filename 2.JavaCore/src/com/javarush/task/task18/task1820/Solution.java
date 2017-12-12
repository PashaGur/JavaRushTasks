package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName2)));
        long rusult = 0;
        while (br.ready()){
            String[] nums = br.readLine().split(" ");
            for (int i = 0; i < nums.length; i++) {
                rusult = Math.round(Double.parseDouble(nums[i]));
                bw.write((int)rusult + " ");
            }
        }
        reader.close();
        br.close();
        bw.close();
    }
}
