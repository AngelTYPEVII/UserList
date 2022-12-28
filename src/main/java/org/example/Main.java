package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> woman = new ArrayList<>();
        List<User> men = new ArrayList<>();
        int p = 99;
        int[] run=new Random().ints(1,p+2).distinct().limit(p+1).toArray();
        for (int i=0;i<=p;i++){
            User user =new User(run[i],Name_generator.genName(),(int) (Math.random() * 110));

            users.add(user);
        }
        System.out.println("Все пользователи: "+users+"\nРазмер списка "+users.size());
        for (User user :users) {
            if (user.getName().equals("Кристина")||user.getName().equals("Ева")||user.getName().equals("София")){
                woman.add(user);
            }
        }
        System.out.println("Женщины "+woman+"\nРазмер списка "+woman.size());
        for (User user :users) {
            if (user.getName().equals("Тимур")||user.getName().equals("Андрей")||user.getName().equals("Илья")){
                men.add(user);
            }
        }
        System.out.println("Мужчины "+men+"\nРазмер списка "+men.size());
    }
}