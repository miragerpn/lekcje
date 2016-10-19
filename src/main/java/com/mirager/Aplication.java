package com.mirager;

import com.mirager.test.Action;
import com.mirager.test.Student;
import com.mirager.test.User;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by MirageR on 2016-10-19.
 */

public class Aplication {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Szymon");
        user.setLastName("Nowak");
        System.out.println(user.toString());
        user.action();

        User student = new Student();
        student.setFirstName("Pawel");
        student.setLastName("Nowacki");
        System.out.println(student.toString());
        student.action();

        Set<Action> actions = new HashSet<Action>();
        actions.add(user);
        actions.add(student);
        Iterator<Action> actionIterator = actions.iterator();
        while(actionIterator.hasNext()){
            Action action = actionIterator.next();
            action.action();

        }
        Action action = () -> {
            System.out.println("Hello world");
        };
        action.action();
        System.out.println();
        actions.stream()

                .forEach((e)-> {e.action();});
    }
    }
//1 create class uczen 3 pola,imie,nazwisko,ocena setters+getters konstrukotor, interface ocena metoda zwracajaca ocene (5 uczniow)wylistowac uczniow ocena<4(while,for,->)
//2

