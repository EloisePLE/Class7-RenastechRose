package Day17_ArraysCont;

import java.util.Arrays;

public class Homework28 {
    public static void main(String[] args) {
        /*
        Write a code with following requirements:
        - Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        - Print the minimum number in the given array.
         */

        int num1[] = {6, 7, 2, 3, 90, -2, -90, -122, 96, 35};
        Arrays.sort(num1);

        System.out.println("The minimum number in array num1 is : " + num1[0]);
    }
}
