package Day17_ArraysCont;

import java.util.Scanner;

public class Homework32 {
    public static void main(String[] args) {
        /*
        Write a program with following requirements:
        1) user should be prompted about how many numbers is going to be entered
        2) User should be prompted for the values of the numbers
        3) Reverse the all the given numbers and print it
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter how many numbers you want in the array: ");
        int size = scan.nextInt();

        double a[] = new double[size];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter a number: ");
            double elements = scan.nextDouble();
            a[i] = elements;
        }
        System.out.println("Array \'a\' printed in reverse order: ");
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + "  ");
    }
}
