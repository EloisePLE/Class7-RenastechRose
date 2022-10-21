package Day5_IfElseStatements;

public class Topic7_IfElseCont {
    public static void main(String[] args) {
        // if (test-expression)
        //      code-to-be-executed-when-true;
        // else
        //      code-to-be-executed-when-false;

        // check if the water is boiling
        double bPoint = 100; // in C
        double temp = 90;

        if (temp == bPoint) {
            System.out.println("water is boiling");
        } else {
            System.out.println("The water is not boiling");
        }
    }
}
