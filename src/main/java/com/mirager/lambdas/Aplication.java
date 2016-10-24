package com.mirager.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by MirageR on 2016-10-21.
 */
public class Aplication {
    public static void main(String[] args) {
        Flat flat1 = new Flat("Londyn", 200000, 100, "abc",2);
        Flat flat2 = new Flat("Londyn", 300000, 100, "cde",2);
        Flat flat3 = new Flat("Bristol", 250000, 150, "fge",3);

        List<Flat> flats = Arrays.asList(flat1, flat2, flat3);
        if (isPresent("Bristol", "fge", 200000, flats)) {
            System.out.println("Posiadamy mieszkania");
        } else {
            System.out.println("Nie posiadamy mieszkan!");
        }

        long smallFlats = flats.stream()
                .filter(flat -> flat.getNoOfRooms() < 3)
                .count();
        System.out.println(smallFlats);

        boolean areAllFromX = areAllFromX(flats, "Bristol");
        System.out.println(areAllFromX);

    }

    public static boolean isPresent(String city, String street, Integer price, List<Flat> flats) {
        return flats.stream()
                .filter(flat -> flat.getPrice() > price)
                .filter(flat -> city.equals(flat.getCity()))
                .anyMatch(flat -> street.equals(flat.getStreet()));

    }

    public static Stream getFlatsStream(List<Flat> flats){
        return flats.stream();

    }
    public static boolean areAllFromX(List<Flat> flats,String city){
        return flats.stream().allMatch(flat->flat.getCity()==city);

    }

}

//dodac pole do klasy flat i filtrowac po nim. zwrocic ilosc danych mieszkan(count). napisac metode ktora zwraca strumien
//napisac metode ktora sprawdzi wa.'/
//
//
// //r