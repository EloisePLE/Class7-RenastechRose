package Day22_MethodOverloadandWrapperClass;

public class Homework35 {
    public static void main(String[] args) {

        System.out.println(equalStrings("Through", "Though"));

    }
    //Write a method where it takes 2 strings as a parameter and returns true
    // when 2 strings are equal and returns false when they are not equal.
    public static boolean equalStrings(String str1, String str2){
        return str1.equals(str2);
    }
}
