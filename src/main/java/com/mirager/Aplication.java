package com.mirager;

import com.mirager.test.*;

import java.util.*;

/**
 * Created by MirageR on 2016-10-19.
 */

public class Aplication{
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
    //    Iterator<Action> iterator = actions.iterator();
        //System.out.println(student.getFirstName());
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


        Uczen uczen1 = new Uczen("Jan","Kowalski",5.0);
        Uczen uczen2 = new Uczen("Andrzej","Wisniewski",4.0);
        Uczen uczen3 = new Uczen("John","Doe",3.0);
        Uczen uczen4 = new Uczen("Jake","Smith",4.5);
        Uczen uczen5 = new Uczen("Eamonn","Wells",3.0);

        List<Ocena> uczniowie = new ArrayList<>();
        uczniowie.add(uczen1);
        uczniowie.add(uczen2);
        uczniowie.add(uczen3);
        uczniowie.add(uczen4);
        uczniowie.add(uczen5);
        uczniowie.add(user);
        uczniowie.add(new Student());
        uczniowie.add(new User());
       /* for (Ocena ocena :uczniowie) {
            if (ocena.returnOcena()<4)
                System.out.println(ocena.toString());
        }*/

        System.out.println("----------------------------------------------------------");
        uczniowie.stream()
                .filter(ocena -> ocena.returnOcena()<4)
                .forEach(ocena-> System.out.println(ocena.returnOcena()));



        }



}
//1 create class uczen 3 pola,imie,nazwisko,ocena setters+getters konstrukotor, interface ocena metoda zwracajaca ocene (5 uczniow)wylistowac uczniow ocena<4(while,for,->)
//2

