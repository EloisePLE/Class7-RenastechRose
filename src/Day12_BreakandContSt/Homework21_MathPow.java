package Day12_BreakandContSt;

import java.util.Scanner;
import java.lang.Math;

public class Homework21_MathPow {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number:
        Calculate the square of all the numbers from 0 to given number
        and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int square = 0;
        while(square <= num){
            square = (int) Math.pow(num, 2);
            System.out.println("The square of the number is: "+square);
            }
    }
}
