package Day17_ArraysCont;

import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        /*
        Write a program that creates an array of 10 elements size.
        Your program should prompt the user to input numbers in array and then display the sum of all
        array elements.
         */
        double num4[] = new double[10];

        for(int i = 0; i < num4.length;i++) {
            System.out.println("Please enter the element "+ (i + 1) +" of the array: ");
            Scanner scan = new Scanner(System.in);
            double elements = scan.nextDouble();
            num4[i] = elements;
        }
        double sumElements = 0;
        for(int i = 0; i<num4.length;i++){
            sumElements += num4[i];
        }
        System.out.println("The sum of all the elements of the array num4 is: "+sumElements);
    }
}