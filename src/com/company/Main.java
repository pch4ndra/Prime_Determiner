package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (1 == 1) {
            int temp;
            boolean isPrime = true;

            System.out.println("Enter any number:");

            int numInput = scan.nextInt();

            for (int i = 2; i <= numInput / 2; i++) {
                temp = numInput % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (numInput == 1 || numInput < 0) {
                System.out.println(numInput + " is Composite.");
            } else if (isPrime) {
                System.out.println(numInput + " is Prime.");
            } else {
                System.out.println(numInput + " is Composite.");
            }

            System.out.println("><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><=><");
        }
    }
}
