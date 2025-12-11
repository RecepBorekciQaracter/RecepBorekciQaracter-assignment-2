package org.example;

import java.util.Scanner;

public class ReverseAndSearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int inputNumber = readInt(scanner);
        int[] inputArray = new int[inputNumber];

        System.out.println("Enter the numbers you want in your array: ");
        fillArray(scanner, inputArray, inputNumber);

        System.out.println("The numbers you entered are: ");
        printArray(inputArray, inputNumber);
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

    public static void fillArray(Scanner sc, int[] array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            array[i] = readInt(sc);
        }
    }

    public static void printArray(int[] array, int arrayLength) {
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
