package com.mirager.lambdas;

import java.io.Serializable;

/**
 * Created by MirageR on 2016-10-21.
 */
public class Flat implements Serializable {
    private String city;
    private Integer price;
    private Integer surface;
    private String street;
    private Integer noOfRooms;

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSurface() {
        return surface;
    }

    public void setSurface(Integer surface) {
        this.surface = surface;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Flat(String city, Integer price, Integer surface, String street, Integer noOfRooms) {
        this.city = city;
        this.price = price;
        this.surface = surface;
        this.street = street;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", surface=" + surface +
                ", street='" + street + '\'' +
                ", noOfRooms=" + noOfRooms +
                '}';
    }
}
