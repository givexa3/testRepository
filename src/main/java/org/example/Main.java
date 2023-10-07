package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        User user1 = new User("USER1", 23, null, new UserDetails("Anabana"));
        User user2 = new User("USER2", 25, null, new UserDetails("GIVEXA"));
        User user3 = new User("USER3", 27, null, new UserDetails("Zoro"));

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        List<User> result = userList
                .stream()
                .sorted(Comparator.comparing(u -> u.getUserDetails().getFullName()))
                .collect(Collectors.toList());

        List<User> result2 = userList
                .stream()
                .sorted(Comparator.comparing(u -> u.getUserDetails().getFullName(), Comparator.reverseOrder()))
                .collect(Collectors.toList());

        result.forEach(d-> System.out.println(d.getName()));

        System.out.println("Result 2: ");

        result2.forEach(d-> System.out.println(d.getName()));

        int a = 10;
        int b = 20;
        int answer = a * b;

        System.out.println(answer);

        System.out.println(calculateValue());
    }

    public static int calculateValue(){
        return 10;
    }

    public static int calculateValue2(){
        return 20;
    }
}