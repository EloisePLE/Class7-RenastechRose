package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework23 {
    public static void main(String[] args) {
        /*
        Write a program where the user is being asked to enter a String
        and that will count how many times "a" or 'A' is found in that entered String
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scan.nextLine();
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) == 'a') || (sentence.charAt(i) == 'A')) {
                sum++;
            }
        }
        System.out.println(sum + " times the letter \"a\" and \"A\" appeared in the sentence.");
    }
}

