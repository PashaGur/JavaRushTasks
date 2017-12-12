package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream;
        do {
            inputStream = new FileInputStream(reader.readLine());
        } while (inputStream.available() >= 1000);{
            inputStream.close();
            throw new DownloadException();
        }


    }

    public static class DownloadException extends Exception {

    }
}
