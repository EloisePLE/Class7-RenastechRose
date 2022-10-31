package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
       /*
        Write a code which asks user to enter a String and removes all the duplicate characters from the String and prints the result
        ex. "AAAAAVVVCCDDAA" ==> "AVCD"
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter some characters: ");
        String word = scan.next();
        String cleanWord = "";

        for (int i = 0; i < word.length(); i++) {
            String newWord = "" + word.charAt(i);
            if (cleanWord.contains(newWord) == false) {
                cleanWord += word.charAt(i);
            }
        }
        System.out.println("cleanWord: " + cleanWord);

    }
}