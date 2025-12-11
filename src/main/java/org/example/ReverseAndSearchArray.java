package org.example;

import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.println();

        int[] reversedArray = reverseArray(inputArray);
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));

        System.out.println("Enter a number to search: ");
        int searchNumber = readInt(scanner);
        searchNumberInArray(inputNumber, inputArray, searchNumber);


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

    public static int[] reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
        }
        return array;
    }

    private static void searchNumberInArray(int inputNumber, int[] inputArray, int searchNumber) {
        ArrayList<Integer> indices = new ArrayList<Integer>();
        boolean found = false;

        for (int i = 0; i < inputNumber; i++) {
            if (inputArray[i] == searchNumber) {
                found = true;
                indices.add(i);
            }
        }

        if (found) {
            System.out.println("Your number is in the array. At the indices: " + indices);
        } else {
            System.out.println("Your number is not in the array.");
        }

    }
}
