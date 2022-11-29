package Day28_InheritanceandAbstraction;

import java.util.ArrayList;

public class Homework46 {
    public static void main(String[] args) {
        /*
        Write 3 methods where it takes the ArrayList of Double
        1) first method returns the maximum number in the list
        2) second method returns the minimum number in the list
        3) third Method prints all elements one by one on the same line
        ( example result = "the List is: 100.9, 12.45, 30.46" )
        Please create 3 methods. All of them will have one parameter which is ArrayList of Double.
        First and second methods will return a double.
        Third method will not return something
         */
        ArrayList<Double> randomNum = new ArrayList<>();
        randomNum.add(2.5);
        randomNum.add(3.5);
        randomNum.add(4.5);
        randomNum.add(5.5);
        randomNum.add(6.5);
        printSameLine(randomNum);
        System.out.println("The maximum number in the ArrayList is: " + maxNumList(randomNum));
        System.out.println("The minimum number in the ArrayList is: " + minNumList(randomNum));

    }
    public static double maxNumList (ArrayList<Double> param1){
        double max = param1.get(0);
        for (int i = 0; i < param1.size(); i++) {
            if(param1.get(i) > max){
                max = param1.get(i);
            }
        }
        return max;
    }
    public static double minNumList (ArrayList<Double> param1){
        double min = param1.get(0);
        for (int i = 0; i < param1.size(); i++) {
            if(param1.get(i) < min) {
                min = param1.get(i);
            }
        }
        return min;
    }
    public static void printSameLine (ArrayList<Double> param1){
        System.out.println("The elements of the ArrayList are: "+ param1);
    }
}

