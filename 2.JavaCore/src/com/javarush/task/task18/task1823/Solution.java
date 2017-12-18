package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        HashMap<String, Integer> resultMap = new HashMap<>();
        while (true) {
            fileName = reader.readLine();
            if(fileName.equals("exit"))break;
            new ReadThread(fileName).start();
        }
        reader.close();


    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            Map<Integer, Integer> map = new HashMap<>();
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    if (map.containsKey(data)){
                        int tmp = map.get(data);
                        map.put(data,++tmp);
                    }
                    else map.put(data, 1);
                }
                ArrayList<Integer> list = new ArrayList<>(map.values());
                Collections.sort(list);
                for (Map.Entry pair : map.entrySet()) {
                    if (pair.getValue() == list.get(list.size()-1)) {
                        resultMap.put(fileName, Integer.parseInt(pair.getKey().toString()));
                    }
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
