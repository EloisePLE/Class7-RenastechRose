package Day22_MethodOverloadandWrapperClass;

public class Homework37 {
    public static void main(String[] args) {
        System.out.println(calcDecimals(7.5, 2.15, 3));
    }

    // Write a method where it takes 2 double values and 1 integer value.
    // When the integer value is 1 it returns to sum of the 2 double numbers,
    // when integer is 2 it returns the subtraction of those 2 double number,
    // when integer value is 3 it returns to the multiplication of those 2 double numbers,
    // and when the integer value is 4 it returns the division of those 2 double numbers.
    public static double calcDecimals(double num1, double num2, int num3) {
        double result = 0;
        if (num3 == 1) {
            result = num1 + num2;
        } else if (num3 == 2) {
            result = num1 - num2;
        } else if (num3 == 3) {
            result = num1 * num2;
        } else if (num3 == 4) {
            result = num1 / num2;
        }
        return result;
    }
}