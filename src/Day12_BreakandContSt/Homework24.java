package Day12_BreakandContSt;

import java.util.Scanner;

public class Homework24 {
    public static void main(String[] args) {
        /*
        Write a code where user is being asked to enter a String and that checks if the String is Palindrome
        PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
        such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
        (This is a bit hard question. It is an Interview question. Work on it we can solve it later on together)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        String check = "";
        for (int i = word.length() - 1; i >= 0; i--)
        {
            check= check + word.charAt(i);
        }
        if(word.equalsIgnoreCase(check))
        {
            System.out.println("The word \""+check+"\" is a palindrome.");
        } else
            System.out.println("This word is not a palindrome.");
    }
}

