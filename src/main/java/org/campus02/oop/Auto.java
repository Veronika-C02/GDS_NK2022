package org.campus02.oop;

public class Auto extends Fahrzeug{

    private int co2;

    @Override
    public double steuer() {

        double steuer = 0;

        if (co2 < 100){

            steuer = (double)((getPS()*15)+(co2*5))/2;

        } else {

            steuer = (getPS()*15)+(co2*5);
        }
        return steuer;
    }

    public Auto(int anzahlAchsen, int PS, String name, int co2) {
        super(anzahlAchsen, PS, name);
        this.co2 = co2;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    @Override
    public String toString() {
        return
                " Name: {" + getName() + "}" +
                " Anzahl: {" + getAnzahlAchsen() + "}"+
                " PS: {" + getPS() + "}" +
                " co2: {" + co2 + "}";
    }
}
