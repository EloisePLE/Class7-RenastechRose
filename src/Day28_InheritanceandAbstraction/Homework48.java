package Day28_InheritanceandAbstraction;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework48 {
    /*
    Write a method where it takes ArrayList of String and the index, returns the element of that index in the ArrayList
    Please create a method that takes 2 parameters. An ArrayList of String and an Integer.
    Return type String.
    Please return the string at the given index.
     */
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("Let's", "do", "it", "!"));
        System.out.println("You chose the element: \"" +indexOfArray(str, 1)+ "\" of the ArrayList");
    }
    public static String indexOfArray (ArrayList<String> param1, Integer param2){
       return param1.get(param2);
    }
}
