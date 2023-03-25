package org.campus02.oop;

public class Lastkraftwagen extends Fahrzeug{

    private int maxTonnage;

    public Lastkraftwagen(int anzahlAchsen, int PS, String name, int maxTonnage) {
        super(anzahlAchsen, PS, name);

        if (maxTonnage >= 1 && maxTonnage <= 40){
            this.maxTonnage = maxTonnage;
        }
    }


    @Override
    public double steuer() {

        double steuer = 0;

        switch (getAnzahlAchsen()){

            case 2: return (double)((getPS()*maxTonnage)/3);
            case 3: return (double) ((getPS()*maxTonnage)/2);
            case 4: return (double)(getPS()*maxTonnage);
            default: return (double)(getPS()*maxTonnage)+1000;

        }
    }

    @Override
    public String toString() {
        return
                " Name: {" + getName() + "}" +
                " Anzahl: {" + getAnzahlAchsen() + "}"+
                " PS: {" + getPS() + "}" +
                " maxTonnage: {" + maxTonnage + "}";
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }
}
