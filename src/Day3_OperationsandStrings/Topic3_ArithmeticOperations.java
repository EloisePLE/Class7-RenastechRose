package Day3_OperationsandStrings;

public class Topic3_ArithmeticOperations {
    public static void main(String[] args) {

        // (+) Addition
        int num1 = 90;
        int num2 = 80;
        int num3 = num1 + num2;
        System.out.println("The result is: " + num3);
        System.out.println("The result here is different: " +num1+num2);
        System.out.println("The result of the addition is: "+(num1+num2));

        int num4 = 300;
        float num5 = 98.754f;
        float num6 = num4+num5;
        System.out.println("The result is: " +num6);

        double num7 = 98.7654;
        int num8 = 900;
        double num9 = num7 + num8;
        System.out.println("The result for double + int is: " +num9);

        // (-) subtraction

        int num10 = 67;
        int num11 = 9000;
        int result = num11 - num10;
        System.out.println("The result is: " + result);

        // (*) multiplication

        int num12 = 95;
        int num13 = 98;
        int result1 = num13 * num12;
        System.out.println("The result of the multiplication is: " + result1);

        double num14 = 89.543;
        double num15 = 87;
        double result2 = num14 * num15;
        System.out.println("The result is: " +result2);

        // (/) division

        int num16 = 89;
        int num17 = 40;
        float nresult = (float)num16/num17;
        System.out.println(nresult);

        // (%) Modulus

        int num21 = 98;
        int num22 = 3;
        int num23 = num21 % num22;
        System.out.println("The result of mod: " +num23);

        double num24 = 90.45;
        double num25 = 8.56;
        double modresult = num24%num25;
        System.out.println("The mod result for double is: " +modresult);





    }
}
