package Day22_MethodOverloadandWrapperClass;

public class Homework36 {
    public static void main(String[] args) {
        int[] nums = {2, 5, 33, 54, 667, -12, 44};
        sortArray(nums);

    }

    //Write a method where it takes array of integers and returns the sorted version of that array.
    public static void sortArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = 0;
                if (numbers[j] < numbers[i]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.print(numbers[i] + " ");
        }

    }
}

