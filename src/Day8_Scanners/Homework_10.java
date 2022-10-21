package Day8_Scanners;

import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        /*Write a code where user is being asked to enter a number and,
        based on the entered number, print the number is positive, negative or zero
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else
            System.out.println("The number is zero.");
    }
}
