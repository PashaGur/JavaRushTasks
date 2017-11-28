package com.javarush.task.task15.task1522;

public class Sun implements Planet {

    private Sun() {}

    private static Sun instance;

    private static class SunHolder {
        private final static Sun instance = new Sun();
    }

    public static Sun getInstance() {
        return instance=SunHolder.instance;
    }

}



