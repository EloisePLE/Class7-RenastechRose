package Day5_IfElseStatements;

public class Topic4_IfStatementcont {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 9;

        int ans = num1 - num2;

        if (ans > 0) {
            System.out.println("the answer is positive and the answer: "+ans);
        }
        if (ans < 0) {
            System.out.println("the answer is negative and the answer: "+ans);
        }
        if ( ans == 0) {
            System.out.println("The answer is 0");
        }
    }
}
