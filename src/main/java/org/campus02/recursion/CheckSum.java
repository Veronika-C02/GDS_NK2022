package org.campus02.recursion;

public class CheckSum {


    public static void main(String[] args) {

        int number = 123;

        /* Komme nicht auf Fehler, wie Summe nicht mehr von dem Initalisierungswert überschrieben wird */

        calculate(number);

        System.out.println("calculate(number) = " + calculate(number));

    }


    public static int calculate(int number){
        int value = 0;

        if (number <= 0){

        }else {

            value += number % 10;
            System.out.println("value = " + value);


            number = number/10;
            System.out.println("number = " + number);

            calculate(number);

        }

        return value;
    }


}
