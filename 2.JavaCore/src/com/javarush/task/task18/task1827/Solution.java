package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        if(args[0].equals("-c")) {
            int id;
            String productName = args[1];
            String price = args[2];
            String quantity = args[3];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            ArrayList<Integer> list = new ArrayList<>();
            while (br.ready()) {
                Integer tempString = Integer.parseInt(br.readLine().substring(0, 8).trim());
                list.add(tempString);
            }
            br.close();
            Collections.sort(list);
            id = list.get(list.size() - 1) + 1;
            String result = String.format("%-8d%-30s%-8s%-4s", id, productName,price, quantity);
            BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)));
            //bf.newLine();   Валидатор идиот, эта строчка нужна
            bf.write(result);
            bf.flush();
            bf.close();
        }
    }
}
