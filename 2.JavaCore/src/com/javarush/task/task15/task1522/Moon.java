package com.javarush.task.task15.task1522;

public class Moon implements Planet {
    private static volatile Moon instance;

        private Moon() {}


        private static class MoonHolder {
            private final static Moon instance = new Moon();
        }

        public static Moon getInstance() {
            return instance=MoonHolder.instance;
        }

    }
