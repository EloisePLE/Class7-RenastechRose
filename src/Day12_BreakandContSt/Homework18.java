package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {
//        Write a code where user is asked to enter an integer number:
//        Using the given number find the factorial of that number and Print the result.
//        example: 5 ==> 5! = 5*4*3*2*1 = 120
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int number = scan.nextInt();

        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
