package Day26_ClassesandConstructors;

import HomeworkClasses.SetNameandLastNameandReturnAge;

public class Homework39 {
    public static void main(String[] args) {
        /*
        Write a code where it calls a method in the different Package and class where it prints your first name and the last name,
        and returns to your age to be printed.
        Please Create 2 packages. Your class will be in a package and your main application will be in another package.
        Your age variable will be private and has a default value of 34.
        Create a method called SetNameandLastNameandReturnAge with 2 parameters. Return the Age variable.
        After returning it, print it to screen.
        You can create a constructor and set values there or not. It is OPTIONAL.
         */
        SetNameandLastNameandReturnAge SetNameAge = new SetNameandLastNameandReturnAge("Eloise Pegoraro Lemos Elemen", 34);
        System.out.println(SetNameAge.PrintNamesReturnAge());
    }
}
