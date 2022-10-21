package Day10_StringMethods;

import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        /*
        Write a code where user is being asked to enter a name:
        if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scan.nextLine();
        if (name.startsWith("A") && name.endsWith("l")) {
            String result = name.replace('A', 'B');
            System.out.println("The result is: "+result);
        } else
            System.out.println("The first letter of this name cannot be replaced.");
    }
}
