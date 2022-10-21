package Day8_Scanners;

import java.util.Scanner;

public class Homework_9 {
    public static void main(String[] args) {
        /*Write a code where User is being asked for the first number,
        second number and third number. Then Compare those number print the maximum number.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose one number: ");
        int num1 = scan.nextInt();
        System.out.println("Choose a second number: ");
        int num2 = scan.nextInt();
        System.out.println("Choose a third number: ");
        int num3 = scan.nextInt();

        if (num1>num2 && num1 > num3) {
            System.out.println("The maximum number is: " +num1);
        } else if (num2>num1 && num2> num3) {
            System.out.println("The maximum number is: "+num2);
        } else if (num3>num1 && num3>num2) {
            System.out.println("The maximum number is: "+num3);
        } else
            System.out.println("There isn't a maximum number.");
    }

}
