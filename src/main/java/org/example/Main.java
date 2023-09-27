package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*String [] nombres = {"Kahty", "Andre", "Robin"};
        System.out.println(nombres[2]);*/

        Map<Integer, String> nombre = new HashMap<> ();
        nombre.put(1, "Kathy");
        nombre.put(2, "Andre");
        nombre.put(3, "Robin");
        nombre.put(4, "antony");
        //System.out.println(nombre.get(4));

        for(String i: nombre.values()){
            System.out.println(i);
        }
    }
}