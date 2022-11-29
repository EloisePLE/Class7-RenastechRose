package Day28_InheritanceandAbstraction;

public class Homework43 {
    /*
    Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string,
    but also could handle a situation where It takes 2 String and 1 integer value
    where it only prints the 2 strings by integer value times.
    example:
    ConcatandPrint("FirstName","LastName") it will return ==> "FirstName LastName" ConcatandPrint("FirstName","LastName", 3)
    it will print ==> "FirstName Lastname" 3 times.
    Please create a method with return type String and with 2 String parameters.
    Method name is ConcatandPrint;
    This method will concatenate 2 parameters and return it.
    Please create an overload method of ConcatandPrint with return type void and with 2 String and 1 Integer parameter.
    This method will concatenate 2 parameters and print the param3 times.
     */
    public static void main(String[] args) {
        System.out.println(ConcatAndPrint("Eloise", "Elemen"));
        System.out.println("**********************");
        ConcatAndPrint("Eloise", "Elemen", 4);

    }
    public static String ConcatAndPrint(String param1, String param2){
        String concatStrings = param1 + " " + param2;
        return concatStrings;
    }
    public static void ConcatAndPrint(String param1, String param2, int param3){
        String concatStrings = param1 + " " + param2;
        for (int i = 0; i < param3; i++) {
            System.out.println(concatStrings);
        }
    }
}
