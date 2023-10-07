package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        UserRenamed userRenamed1 = new UserRenamed("USER1", 23, null, new UserDetails("Anabana"));
        UserRenamed userRenamed2 = new UserRenamed("USER2", 25, null, new UserDetails("GIVEXA"));
        UserRenamed userRenamed3 = new UserRenamed("USER3", 27, null, new UserDetails("Zoro"));

        List<UserRenamed> userRenamedList = new ArrayList<>();
        userRenamedList.add(userRenamed1);
        userRenamedList.add(userRenamed2);
        userRenamedList.add(userRenamed3);

        List<UserRenamed> result = userRenamedList
                .stream()
                .sorted(Comparator.comparing(u -> u.getUserDetails().getFullName()))
                .collect(Collectors.toList());

        List<UserRenamed> result2 = userRenamedList
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
    }
}