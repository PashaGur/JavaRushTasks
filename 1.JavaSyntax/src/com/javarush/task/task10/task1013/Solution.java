package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private String lastName;
        private boolean kids;
        private String workSpace;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, String lastName) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
        }

        public Human(String name, int age, boolean sex, String lastName, boolean kids) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
            this.kids = kids;
        }

        public Human(String name, int age, boolean sex, String lastName, boolean kids, String workSpace) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
            this.kids = kids;
            this.workSpace = workSpace;
        }

        public Human(String name, int age, boolean sex, String lastName, String workSpace) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.lastName = lastName;
            this.workSpace = workSpace;

        }
        public Human(String name, boolean sex, String lastName, String workSpace) {
            this.name = name;
            this.sex = sex;
            this.lastName = lastName;
            this.workSpace = workSpace;

        }
        public Human(String name, int age, String lastName, String workSpace) {
            this.name = name;
            this.age = age;
            this.lastName = lastName;
            this.workSpace = workSpace;

        }
        public Human(String name, boolean sex, String lastName, boolean kids, String workSpace) {
            this.name = name;
            this.sex = sex;
            this.lastName = lastName;
            this.kids = kids;
            this.workSpace = workSpace;
        }
    }
}
