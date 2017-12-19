package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] arr = fileScanner.nextLine().split(" ");

            String firstName = arr[1];
            String middleName = arr[2];
            String lastName = arr[0];

            Calendar calendar = new GregorianCalendar(Integer.parseInt(arr[5]),
                    Integer.parseInt(arr[4]) - 1,
                    Integer.parseInt(arr[3]));
            return new Person(firstName, middleName, lastName, calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
