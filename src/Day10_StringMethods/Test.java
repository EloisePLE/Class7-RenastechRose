package Day10_StringMethods;

public class Test {
    public static void main(String[] args) {
        String test = "My name is Eloise.";
        String newTest = test.substring(0, 1)+'G'+test.substring(2, 3)+'G'+test.substring(4);
        System.out.println(newTest);
    }
}
