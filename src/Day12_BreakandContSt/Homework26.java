package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
        /*
        Write a code where it asks the user to enter an integer number.
        Reverse the given number and print the result
        Example input ( 5678 )
        Example output ( 8765 )
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a four-digit integer number: ");
        int num4 = scan.nextInt();
        String revNum4 = "";
        for(int i = String.valueOf(num4).length()-1; i >= 0; i--)
        {
            revNum4 = revNum4 + String.valueOf(num4).charAt(i);
        }
        System.out.println("Reversed number: "+revNum4);
    }
}
