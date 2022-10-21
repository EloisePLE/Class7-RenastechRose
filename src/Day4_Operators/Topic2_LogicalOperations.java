package Day4_Operators;

public class Topic2_LogicalOperations {
    public static void main(String[] args) {
//         AND "&&" In order for the operator to result true all the operations should be true.
        boolean checklogic = true&&true;
        System.out.println("The logic is: "+checklogic);

        boolean logic1 = (78==90)&&(876 !=8907)&&(98>23);
        System.out.println("Result: "+logic1);

        boolean logic2 = false&&false&&false;
        System.out.println("the logic2: "+logic2);

//        OR || in order to have a true logic operation it is enough to have only one true.

        boolean logic3 = false||false||false||true;
        System.out.println("the logic3: "+logic3);

        boolean logic4 = !(!(90==90) || (90!=80) || (76>90));
        System.out.println("The result for logic4: "+logic4);

        boolean logic5 = ((89==89)&&(45>=23))||((67<=90)&&(true));
        System.out.println("logic5 is: "+logic5);


    }
}
