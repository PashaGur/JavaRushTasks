package com.javarush.task.task15.task1522;

public class Earth implements Planet {
    private static volatile Earth instance;

    private Earth() {}


    private static class EarthHolder {
        private final static Earth instance = new Earth();
    }

    public static Earth getInstance() {
        return instance=EarthHolder.instance;
    }

}
