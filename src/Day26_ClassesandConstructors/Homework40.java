package Day26_ClassesandConstructors;

public class Homework40 {
    public static void main(String[] args) {
        /*
        Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on)
        and it returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends.
        Please create a method that takes one integer parameter and returning a String.
        Name your Method as (GotoSleeporWork)
        Based on your parameter, if you are in weekdays, return "Go To Work" otherwise return "Go Back to Sleep".
         */
        System.out.println(GotoSleeporWork(4));
    }
    public static String GotoSleeporWork(Integer param1) {
        if (param1 == 6 || param1 == 7) {
            return "Go Back to Sleep";
        } else if (param1 > 7 || param1 < 1) {
           return "Not a valid option.";
        }
        return ("Go to Work");
    }


}
