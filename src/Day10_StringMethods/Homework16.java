package Day10_StringMethods;

import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
        /*
        Write a code where it meets the below requirements:
        - a couple just got married and goes to city hall to get their last name changed
        - the officer who works there asks the couple about their first name and last name for each
        - also asks if they want to use the same last name or keep their original last names
        (for the same last name you can use either one of them)
        - based on the answer print the couples first names and last names
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Today is the beginning of your next chapter. Congratulations! Now, please tell me your first and last names.");
        System.out.println("Woman: My first name is: ");
        String wfname = scan.nextLine();
        System.out.println("Woman: and my last name is: ");
        String wlname = scan.nextLine();
        System.out.println("Man: My first name is: ");
        String mfname = scan.nextLine();
        System.out.println("Man: My last name is: ");
        String mlname = scan.nextLine();
        System.out.println("Do want to use the \"same last name\" or keep your \"original\" last names? Madam, you can tell me first.");
        String wanswer = scan.nextLine();
        if (wanswer.equalsIgnoreCase("original")) {
            System.out.println("I want to keep my name as it is: " + wfname + " " + wlname);
        } else
            System.out.println("I want to add my husband's last name: " + wfname + " " + wlname + " " + mlname);
        System.out.println("You sir?");
        String manswer = scan.nextLine();
        if (manswer.equalsIgnoreCase("original")) {
            System.out.println("I want to keep my name as it is: " + mfname + " " + mlname);
        } else
            System.out.println("I want to add my wife's last name: " + mfname + " " + mlname + " " + wlname);
    }
}

