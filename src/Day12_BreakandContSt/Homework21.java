package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number:
        Calculate the square of all the numbers from 0 to given number
        and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        int num2 = 1;
        while (num2 <= number) {
            System.out.println(num2 + "*" + num2 + "=" + num2 * num2);
            num2++;
        }

    }
}
