package Day4_Operators;

public class Topic1_RelationalOperators {
    public static void main(String[] args) {
//        "==" Check if 2 things are equal
        boolean check = 2 == 8;
        System.out.println("the answer is: "+check);
        int a = 90;
        int b = 110;
        boolean check1 = a == b;
        System.out.println("is a equal to b: "+check1);
        boolean check2 = 20 == 20;
        System.out.println(check2);

//         "<" check if one thing is less than the other

        boolean check3 = 60>110;
        System.out.println("is 60 less than 110: "+check3);

//        ">" check if one thing is greater than another

        boolean check4 = 90>40000;
        System.out.println("Is 90 greater than 40000: "+check4);

//        "<=" check if one thing is less than or equal to another thing

        boolean check5 = 100<=500;
        System.out.println("Is 100 less than or equal to 500: "+check5);
        boolean check6 = 900<=900;
        System.out.println("result: "+check6);

//        ">=" check if one this is greater than or equal to another thing

        boolean check7 = 956>=120;
        System.out.println("Is 956>= 120: "+check7);

//        "!=" check if 2 things are not equal

        boolean check8 = 90 != 90;
        System.out.println("Not equal: "+check8);

//        "!" check if the "not" of something is true or false

        boolean check9 = !(!(234 != 789));
        System.out.println("The value for check9: "+check9);

        boolean check10 = !(!(90==23)==!(98>98));
        System.out.println("The check10 is: "+check10);

    }
}
