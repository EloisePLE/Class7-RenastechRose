package Day17_ArraysCont;

import java.util.Arrays;

public class Homework34 {
    public static void main(String[] args) {
        /*
        Write code where it shifts all the elements in array by one index and put the first index at the end of the array
        Example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
         */
        int numbers [] = {1, 2, 3, 4, 5, 6, 7};
        int swap = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = swap;
        System.out.println(Arrays.toString(numbers));

    }

}

