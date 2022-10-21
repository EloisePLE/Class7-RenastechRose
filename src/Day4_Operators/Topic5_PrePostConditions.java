package Day4_Operators;

public class Topic5_PrePostConditions {
    public static void main(String[] args) {
        int a = 46;
        int b = 43;
        System.out.println(a+b);

//        ++ is increment which is increasing by 1
        int num = 56;
        System.out.println(num++);
//        variable++ is post-condition
        int num2 = 23;
        num2++;
        System.out.println(num2);
    }
}
