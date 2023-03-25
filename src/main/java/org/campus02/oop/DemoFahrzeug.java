package org.campus02.oop;

public class DemoFahrzeug {


    public static void main(String[] args) {

        System.out.println(" --------------- ELEKTRO --------------");
        
        ElektroAuto elektroAuto = new ElektroAuto(2,116,"TESLA", 102);
        System.out.println("elektroAuto = " + elektroAuto);
        System.out.println("elektroAuto.steuer() = " + elektroAuto.steuer());


        System.out.println(" --------------- LASTKRAFTWAGEN --------------");
        
        Lastkraftwagen lastkraftwagen = new Lastkraftwagen(2,200,"LKW WALTER",10);
        Lastkraftwagen lastkraftwagen2 = new Lastkraftwagen(2,100,"LKW WALTER - TYP2",5);
        System.out.println("lastkraftwagen = " + lastkraftwagen);
        System.out.println("lastkraftwagen.steuer() = " + lastkraftwagen.steuer());


        System.out.println(" --------------- AUTO --------------");
        
        Auto auto = new Auto(2,100, "VW Polo",90);
        System.out.println("auto = " + auto);
        System.out.println("auto.steuer() = " + auto.steuer());


        System.out.println(" --------------- FLOTTE --------------");

        // Flotte anlegen
            Flotte flotte = new Flotte();
            flotte.add(elektroAuto);
            flotte.add(lastkraftwagen);
            flotte.add(lastkraftwagen2);
            flotte.add(auto);

        // Methoden
        flotte.printAll();

        System.out.println("flotte.getDurchschnittssteuer() = " + flotte.getDurchschnittssteuer());

        System.out.println("flotte.getMaximalSteuer() = " + flotte.getMaximalSteuer());

        System.out.println("flotte.getFahrzeugeJeTyp() = " + flotte.getFahrzeugeJeTyp());

    }
    
    
}
