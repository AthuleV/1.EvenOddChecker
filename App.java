/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenoddchecker;
import java.util.Scanner;
/**
 *
 * @author Lenovo-User
 */
public class App {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }

    // Method to check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
