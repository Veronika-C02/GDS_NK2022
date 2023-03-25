package org.campus02.arrays;

import java.util.Arrays;

public class SecureHelper {

    public static final int KEY = 2;

    public static void main(String[] args) {

            // Test von einem Char --> Int
            char j = 'J';
            int intOfJ = (int) j;
            System.out.println("intOfJ = " + intOfJ);


        // input Text
        System.out.println(" --------------- INPUT TEXT --------------");
        
        String someText = "Java";
        System.out.println("KEY = " + KEY);


        char[] someCharArray = someText.toCharArray();
        System.out.println("Arrays.toString(someCharArray) = " + Arrays.toString(someCharArray));


        // Test der encrpyt Methode
        System.out.println(" --------------- ENCRYPT --------------");
        int[] encodedText = encrypt(someText, KEY);

        System.out.println("Arrays.toString(encrypt(someText,2)) = " + Arrays.toString(encrypt(someText,KEY)));

        // Test der decrpyt Methode
        System.out.println(" --------------- DECRYPT --------------");
        System.out.println("decrpyt() = " + (decrpyt(encodedText,KEY)));
        

    }
    
    public static int[] encrypt (String textToEncrpt, int key){
        
        int[] encrpytArray = new int[textToEncrpt.length()];
            int indexCounter = 0;
        
        char[] charsOfText = textToEncrpt.toCharArray();

        for (char c : charsOfText) {
            int charValue = (int) c + key;
            
            encrpytArray[indexCounter] = charValue;
            indexCounter++;
            
        }
        
        return encrpytArray;
    }

    public static String decrpyt (int[] encodedText, int key){

        String readableText = "";

        for (int value : encodedText) {

            char character = (char) (value - key);

            readableText += character;

        }

        return readableText;
    }
    
}
