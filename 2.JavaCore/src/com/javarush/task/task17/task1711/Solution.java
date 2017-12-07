package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i + 1].equals("ж"))
                            allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        else
                            allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 2])));
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            }
            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
                        if (args[i + 2].equals("ж"))
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        else allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(args[i + 3]));
                    }
                    break;
                }
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDay(null);
                    }
                    break;
                }
            }
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        String vivod = (allPeople.get(Integer.parseInt(args[i])).getName());
                        if (allPeople.get(Integer.parseInt(args[i])).getSex() == Sex.FEMALE) vivod += " ж ";
                        else vivod += " м ";
                        System.out.println(vivod + new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format
                                (allPeople.get(Integer.parseInt(args[i])).getBirthDay()));
                    }
                    break;
                }
            }

        }
    }
}
