package org.example;

public class Name_generator {
    public static String genName() {
        String[] name = {"Тимур", "Андрей", "Илья", "Кристина", "Ева", "Вика"};
        int in = (int) (Math.random() * name.length);
        String newName = name[in];
        return newName;
    }
}