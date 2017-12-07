package com.javarush.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем секунды
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        String s = reader.readLine();
        reader.readLine();
        stopwatch.interrupt();
        reader.close();
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                while (!isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
                //add your code here - добавьте код тут
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
