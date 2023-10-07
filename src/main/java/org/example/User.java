package org.example;

public class User {
    private String name;
    private int age;
    private Person person;
    private UserDetails userDetails;

    private int weight;

    private int size;

    private int height;

    public User(String name, int age, Person person, UserDetails userDetails) {
        this.name = name;
        this.age = age;
        this.person = person;
        this.userDetails = userDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
