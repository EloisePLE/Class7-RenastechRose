package Day28_InheritanceandAbstraction;

import java.util.ArrayList;

public class Homework47 {
    /*
    Write a Method where it takes a String parameter and returns an ArrayList of Integer.
    The method will return All the numbers in the String
    ex: String str = "This234 is ju3st St1in6"
    result = {2,3,4,3,1,6}
    Hint: in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i) )
     */
    public static void main(String[] args) {
        String str = "This234 is ju3st St1in6";
        System.out.println("The numbers in the string are: "+ numbersInTheString(str));
    }
    public static ArrayList<Integer> numbersInTheString (String param1){
        ArrayList<Integer> numbersOnly = new ArrayList<>();
        for (int i = 0; i < param1.length(); i++) {
            boolean check = Character.isDigit(param1.charAt(i));
            if(check){
                String str = "" + param1.charAt(i);
                Integer num = Integer.valueOf(str);
                numbersOnly.add(num);
            }
        }
        return numbersOnly;
    }
}
