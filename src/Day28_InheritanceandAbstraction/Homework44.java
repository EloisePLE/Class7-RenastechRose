package Day28_InheritanceandAbstraction;

import java.util.ArrayList;

public class Homework44 {
    /*
    Write a method where it takes 2 String arrays and returns to an ArrayList where it contains all the elements of the Arrays
    arr1   =   {"A",   "B",   "C"};
    arr2   =   {"D",   "E",   "F",   "G"};
    result   ==>   {"A",   "B",   "C",   "D",   "E",   "F",   "G"}
    Please create a method with 2 String array parameters.
    Return an ArrayList of String.
    Method name is MergeArrays
    You will merge two given array into an ArrayList.
     */
    public static void main(String[] args) {
        String [] array1 = {"t", "u", "v"};
        String [] array2 = {"w", "x", "y", "z"};
        System.out.println(MergeArrays(array1, array2));
    }
    public static ArrayList<String> MergeArrays(String [] array1, String [] array2) {
        ArrayList<String> mergedArrays = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            mergedArrays.add(array1[i]);
        }
        for (int j = 0; j < array2.length; j++) {
            mergedArrays.add(array2[j]);
        }
        return mergedArrays;
    }
}
