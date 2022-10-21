package Day10_StringMethods;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        /*
        Write a code where user is being asked to enter a sentence
        if the sentence starts with "B" or "b" and ends with "E" or "e" and also contains "A" or "a".
        Replace second and fourth characters with "G".
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sntc = scan.nextLine();

        if ((sntc.startsWith("B") || sntc.startsWith("b")) && (sntc.endsWith("E") || sntc.endsWith("e")) && (sntc.contains("A") || sntc.contains("a"))) {
            String sntc2 = sntc.substring(0, 1)+'G'+sntc.substring(2, 3)+'G'+sntc.substring(4);
            System.out.println(sntc2);
        } else
            System.out.println("The sentence won't be changed.");
    }
}
