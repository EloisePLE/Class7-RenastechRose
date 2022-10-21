package Day5_IfElseStatements;

public class Topic3_IfStatementExample {
    public static void main(String[] args) {
        // if (test-expression) code-to-be-executed-when-true;
        // if ((test-condition1) && (test-condition2)) execute-this-code;
        // if ((test-condition1) || (test-condition2)) execute-this-code;

        int a = 89;
        int b = 23;
        int c = 567;

        if(a > b && a > c) {
            System.out.println("The highest number is: "+a);
        }
        if (b > a && b > c) {
            System.out.println("The highest number is: "+b);
        }
        if (c > b && c > a) {
            System.out.println("The highest number is: "+c);
        }
        if (a == b && b==c) {
            System.out.println("All the numbers are equal");
        }
    }
}
