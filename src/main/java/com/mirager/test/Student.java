package com.mirager.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MirageR on 2016-10-19.
 */
public class Student extends User {
    private List<String> grades;
    private Map<String,User> lessons;

    public Student() {
        grades= Arrays.asList("2.0","3.0","4.0");
        lessons = new HashMap<String, User>();
    }

    public List<String> getGrades() {

        return grades;
    }

    public void setGrades(List<String> grades) {
        this.grades = grades;
    }

    public Map<String, User> getLessons() {
        return lessons;
    }

    public void setLessons(Map<String, User> lessons) {
        this.lessons = lessons;
    }
    public void action(){
        System.out.println("My name is "+toString()+" "+"my grades are "+grades.toString());
    }
}
