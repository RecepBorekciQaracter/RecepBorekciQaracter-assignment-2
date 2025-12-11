package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderManipulation {
    public static void main(String[] args) {
        repeater();
    }

    public static void repeater() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words do you like to enter? ");
        int inputNumber = readInt(scanner);
        scanner.nextLine();

        String[] words = new String[inputNumber];

        fillArray(scanner, words,  inputNumber);
        System.out.println("The words: " + Arrays.toString(words));

        System.out.println("How many times do you like to repeat these words? ");
        int repeatNumber = readInt(scanner);
        scanner.nextLine();

        repeatTheWords(inputNumber, repeatNumber, words);

    }



    public static int readInt(Scanner sc) {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }
    }

    public static String readString(Scanner sc) {
        while (true) {
            if (sc.hasNextLine()) {
                return sc.nextLine();
            } else {
                System.out.println("Please enter a valid string.");
            }
        }
    }

    public static void fillArray(Scanner sc, String[] array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            array[i] = readString(sc);
        }
    }

    private static void repeatTheWords(int inputNumber, int repeatNumber, String[] words) {
        StringBuilder sb = new StringBuilder();

        if (inputNumber < 1 || repeatNumber < 1) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < repeatNumber; j++) {
                sb.append(word).append(" ");
            }
        }

        System.out.println(sb);
    }

}

