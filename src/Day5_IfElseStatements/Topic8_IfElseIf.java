package Day5_IfElseStatements;

public class Topic8_IfElseIf {
    public static void main(String[] args) {
        /*
        if (condition) {
        code block
        } else if (condition2) {
        another code block
        } else {
        none of the above - just run this code
        }
         */
        // write a code where it checks when 2 numbers are subtracts if the result is negative or positive or zero
        int num1 = 10;
        int num2 = 9;

        int ans = num1 - num2;

        if (ans > 0) { // check if ans is positive
            System.out.println("the answer is positive and the answer: " + ans);
        }
        if (ans < 0) { // check if ans is negative
            System.out.println("the answer is negative and the answer: " + ans);
        }
        if (ans == 0) { // check if ans is zero
            System.out.println("the answer is zero and the answer is : " + ans);
        }

    }
}
