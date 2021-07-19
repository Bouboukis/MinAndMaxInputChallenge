package com.georgioskachrimanis.javacourse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0, max = 0;
        boolean firstEntry = true;

        while (true) {

            System.out.println("Enter Number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {

                int userInput = scanner.nextInt();

                // If statement to declare the begining value of max nad min.
                if (firstEntry) {
                    max = min = userInput;
                    firstEntry = false;
                }

                if (userInput < min){
                    min = userInput;
                }

                if (userInput > max) {
                    max = userInput;
                }


            } else {
                break;
            }

            scanner.nextLine(); // Handle input
        }

        System.out.println("The Maximum number you have entered is: " + max);
        System.out.println("The minimum number you have entered is: " + min);
        scanner.close();
    }
}
