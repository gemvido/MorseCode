package mrc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sysin = new Scanner(System.in);


        System.out.println(c.yellow + "To translate English to Morse code, type [1].");
        System.out.println(c.yellow + "To translate Morse code to English, type [2].");


        System.out.print(c.green + "Enter input:\n" + c.cyan + "> ");

        byte inputbyte = sysin.nextByte();


        if (inputbyte == 1) {

            toMorse();



        } else if (inputbyte == 2) {

            toEnglish();

        } else {


            throw new IllegalStateException("Invalid input.");

        }








    }



    public static void toMorse () {


        morsemap.add();

        Scanner sysin = new Scanner(System.in);


        System.out.println("Enter a phrase to translate to morse code: ");

        String input = sysin.nextLine();




        String[] letters = input.split("");



        for (int j = 0; j < letters.length; j++) {
            String letter = letters[j];

            if (letter.equals(" ")) {
                System.out.print(c.noRepeat() + "  [SPACE]  ");
            } else {
                String morse = morsemap.morseMap.get(letter.toUpperCase());
                System.out.print(c.noRepeat() + morse + " ");
            }




        }


        System.exit(0);
    }



    public static void toEnglish () {

        engmap.add();

        Scanner sysin = new Scanner(System.in);

        System.out.println("Enter a phrase to translate to English: ");

        String input = sysin.nextLine();


        Scanner morsein = new Scanner(input);


        while (morsein.hasNext()) {

            String morse = morsein.next();

            if (morse.equals(" ") || morse.contains("[SPACE]") || morse.contains("null")) {
                System.out.print(" ");
            } else {
                String letter = engmap.engMap.get(morse.replaceAll(" ", ""));
                System.out.print(letter);
            }



        }




    }


}
