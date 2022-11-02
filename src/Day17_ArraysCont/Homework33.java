package Day17_ArraysCont;

import java.text.NumberFormat;
import java.util.Scanner;

public class Homework33 {
    public static void main(String[] args) {
        /*
        Write a code where the user is asked to enter for 5 employee salaries and store those salaries.
        Then, find the average salary of those 5 employees.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the HR page! Please enter the salary of your 5 employees when prompted.");

        double salary [] = new double[5];
        for(int i = 0; i < salary.length; i++) {
            System.out.print("Enter the salary $: ");
            double value = scan.nextDouble();
            salary[i] = value;
        }
        double average = (salary[0]+salary[1]+salary[2]+salary[3]+salary[4]) / 5;
        String averageCurrency = NumberFormat.getCurrencyInstance().format(average);
        System.out.println("The average salary of your 5 employees is: "+averageCurrency);
    }
}
