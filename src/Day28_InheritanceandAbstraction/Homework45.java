package Day28_InheritanceandAbstraction;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework45 {
    /*
    Write a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers.
    ex:   list     ==>   {1,1,2,3,3,4,5,6}
          result   ==>   {2,4,5,6}
    Please create a method with an Arraylist of Integer parameter.
    Return an Arraylist of Integer.
    Please define a method name that makes sense about what this method is doing.
    In your method, you will find unique numbers in parameter, and you will add them to your return arraylist.
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 4, 4, 5));
        System.out.println(list);
        System.out.println(uniqueNumbersArray(list));
    }
    public static ArrayList<Integer> uniqueNumbersArray (ArrayList<Integer> param1){
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < param1.size(); i++) {
            int count = 0;
            for (int j = 0; j < param1.size(); j++) {
                if(param1.get(i) == param1.get(j)){
                    count++;
                }
            }
            if (count == 1){
                uniqueNumbers.add(param1.get(i));
            }
        }
        return uniqueNumbers;
    }
}
