package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (countSeconds >= 0) {
                if (countSeconds == 0) {
                    System.out.println("Марш!");
                    break;
                }
                System.out.println(countSeconds + " ");
                try {
                    Thread.sleep(1000);
                    countSeconds--;
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    break;
                }
            }
        }
    }
}

