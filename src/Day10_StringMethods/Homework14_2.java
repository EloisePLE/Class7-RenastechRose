package Day10_StringMethods;

import java.util.Scanner;

public class Homework14_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence that starts with \"b\" ends with \"e\" and contains \"a\"");
        String sentence = scan.nextLine();
        String newSentence = "";
        char g = 'G';
        if ((sentence.startsWith("b") || sentence.startsWith("B")) &&
                (sentence.endsWith("e") || sentence.endsWith("E")) && (sentence.contains("a") || sentence.contains("A"))) {
            for (int i = 0; i < sentence.length(); i++) {
                if (i == 1 || i == 3) {
                    newSentence += g;
                } else {
                    newSentence += sentence.charAt(i);
                }
            }
            System.out.println("The new sentence is: " + newSentence);
        } else {
            System.out.println("try again");
        }
    }
}
