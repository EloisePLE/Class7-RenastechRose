package Day12_BreakandContSt;

public class Homework22 {
    public static void main(String[] args) {
        /*
        Write a program that will print numbers from 15 to 5 descending.
        Expected output: 15 14 13 12 11 10 9 8 7 6 5
         */
        int num1 = 15;
        int num2 = 5;
        while(num1>=num2){
            System.out.print(num1+ " ");
            num1--;
        }
    }
}
