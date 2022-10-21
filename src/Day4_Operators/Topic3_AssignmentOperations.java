package Day4_Operators;

public class Topic3_AssignmentOperations {
    public static void main(String[] args) {
        int a = 80;
        System.out.println("The a value is: "+a);

        a = 90;
        System.out.println("The value now is: "+a);

        a = a +40;
        System.out.println("the value now is: "+a);

        int b = 100;

        b = b - 30;
        System.out.println("The value of b is: "+b);

        int theAnswer = b - a;
        System.out.println("b - a equals: "+theAnswer);
    }
}
