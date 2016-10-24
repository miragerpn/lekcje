package com.mirager.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mirager.lambdas.Flat;

import java.io.IOException;

/**
 * Created by MirageR on 2016-10-21.
 */
public class Aplication {


    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Flat flat = new Flat("Londyn", 200000, 100, "abc",5);
        String flatJson = objectMapper.writeValueAsString(flat);
        Flat flat1;
        flat1=objectMapper.readValue(flatJson,Flat.class);
        System.out.println("------------------------------------");
        System.out.println(flat1.toString());
    }
}
