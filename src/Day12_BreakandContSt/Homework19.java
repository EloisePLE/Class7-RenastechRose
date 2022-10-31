package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number
        and check for every number between 0 to that number
        to see how many numbers between 0 to that number can be divided to 3 and 5
        and sum all those numbers, Print the result.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all the numbers that can be divided by 3 and 5 is " + sum);
    }
}
