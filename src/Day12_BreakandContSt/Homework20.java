package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number.
        Find the sum of all the even numbers between 0 to that number (included)
        Find the sum of all the odd numbers between 0 to that number (included)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= num; i++) {
            if(i%2 == 0){
                sum1 += i;
            } else
                sum2 += i;
        }
        System.out.println("The sum of all the even numbers between 0 and "+num+ " is " +sum1);
        System.out.println("The sum of all the odd numbers between 0 and "+num+ " is " +sum2);
    }
}
