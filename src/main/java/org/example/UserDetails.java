package org.example;

public class UserDetails {
    private String firstName;
    private String lastName;

    public UserDetails(String fullName) {
        this.fullName = fullName;
    }

    public UserDetails(String firstName, String lastName, String fullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

    private void sayHi(){
        System.out.println("Hi New MethoD!!!");
    }
}
