package Day17_ArraysCont;

import java.util.Arrays;

public class Homework34 {
    public static void main(String[] args) {
        /*
        Write code where it shifts all the elements in array by one index and put the first index at the end of the array
        Example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
         */
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int swap = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = swap;
        System.out.println(Arrays.toString(a));
    }

}

