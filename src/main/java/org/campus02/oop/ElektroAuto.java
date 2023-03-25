package org.campus02.oop;

public class ElektroAuto extends Fahrzeug{

    private int kapazitaet;



    @Override
    public double steuer() {

        double steuer = 0;

        if (kapazitaet < 50 ){
            steuer = 100;
        } if (kapazitaet >= 50 && kapazitaet < 100){

            if (( kapazitaet + (getPS()*10)) > 1000){
                steuer = 1000;
            } else {
                steuer = (kapazitaet + (getPS()*10));
            }

        }if (kapazitaet >= 100){

            if (( kapazitaet + (getPS()*8.5)) < 1200){
                steuer = 1200;
            } else {
                steuer = (kapazitaet + (getPS()*8.5));
            }

        }
        return steuer;
    }


    public ElektroAuto(int anzahlAchsen, int PS, String name, int kapazitaet) {
        super(anzahlAchsen, PS, name);
        this.kapazitaet = kapazitaet;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    @Override
    public String toString() {
        return
                " Name: {" + getName() + "}" +
                " Anzahl: {" + getAnzahlAchsen() + "}"+
                " PS: {" + getPS() + "}" +
                " Kapazität: {" + kapazitaet + "}";
    }
}
