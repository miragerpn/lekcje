package com.mirager.test;

/**
 * Created by MirageR on 2016-10-19.
 */
public class User implements Action{
    private String firstName;
    private String lastName;

    public User(){};
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;
    }
    public String toString(){
        return firstName +" "+lastName;
    }

    public void action() {
        System.out.println("My name is "+toString());
    }
}
