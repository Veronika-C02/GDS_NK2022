package org.campus02.oop;

import java.util.*;

public class Flotte {

    private ArrayList<Fahrzeug> fahrzeuge;

    public void add(Fahrzeug fahrzeug){

        fahrzeuge.add(fahrzeug);

    }

    public void printAll(){

        for (Fahrzeug fahrzeug : fahrzeuge) {

            System.out.println(fahrzeug.toString());

        }
    }

    public double getDurchschnittssteuer(){

        double averageSteuer = 0;
        double totalSteuer = 0;

        for (Fahrzeug fahrzeug : fahrzeuge) {

            totalSteuer += fahrzeug.steuer();

        }

        averageSteuer = totalSteuer / fahrzeuge.size();

        return averageSteuer;
    }

    public double getMaximalSteuer(){

        double maxSteuer = 0;

        for (Fahrzeug fahrzeug : fahrzeuge) {

            if (fahrzeug.steuer() > maxSteuer){
                maxSteuer = fahrzeug.steuer();
            }
        }

        return maxSteuer;
    }

    public HashMap<String, Integer> getFahrzeugeJeTyp(){

        /* get.Class().getName --> habe .getSimpleName() gewählt, weil es schöner ist :) */

        HashMap<String, Integer> fahrzeugeTypen = new HashMap<>();

        for (Fahrzeug fahrzeug : fahrzeuge ) {

            if (fahrzeugeTypen.containsKey(fahrzeug.getClass().getSimpleName())){

                Integer value = fahrzeugeTypen.get(fahrzeug.getClass().getSimpleName());
                fahrzeugeTypen.put(fahrzeug.getClass().getSimpleName(), value+1);

            } else {
                fahrzeugeTypen.put(fahrzeug.getClass().getSimpleName(), 1);
            }
        }

        return fahrzeugeTypen;
    }


    public Flotte() {
        this.fahrzeuge = new ArrayList<>();
    }



}
