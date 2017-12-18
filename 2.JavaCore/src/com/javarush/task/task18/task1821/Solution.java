package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        TreeMap<Byte, Integer> freqMap = new TreeMap<>();
        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                if (freqMap.containsKey(buffer[i])) freqMap.put(buffer[i], freqMap.get(buffer[i]) + 1);
                else freqMap.put(buffer[i], 1);
            }
        }
        inputStream.close();

        for (Map.Entry pair : freqMap.entrySet()) {
            System.out.println((char)((byte)pair.getKey())+ " " + pair.getValue());
        }
    }
}
