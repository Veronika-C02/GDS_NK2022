package org.campus02.oop;

public abstract class Fahrzeug {

    private int anzahlAchsen;
    private int PS;
    private String name;


    public abstract double steuer();



    public Fahrzeug(int anzahlAchsen, int PS, String name) {
        this.anzahlAchsen = anzahlAchsen;
        this.PS = PS;
        this.name = name;
    }



    public int getAnzahlAchsen() {
        return anzahlAchsen;
    }

    public void setAnzahlAchsen(int anzahlAchsen) {
        this.anzahlAchsen = anzahlAchsen;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return
                " Name: {" + name + "}" +
                " Anzahl: {" + anzahlAchsen + "}"+
                " PS: {" + PS + "}";
    }
}
