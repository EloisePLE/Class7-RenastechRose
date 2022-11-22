package Day26_ClassesandConstructors;

public class Homework42 {
    public static void main(String[] args) {
        /*
        Write a method where it takes a String and returns to a String by adding "Not" in front of the String
        only if It does not have "Not" in front of it already.
        For example :
        notString("Car" ) == > "Not Car"
        notString("Home"). ==> "Not Home"
        notString("Not Home") == > "Not Home"
         */
        System.out.println(AddNot("House"));
        System.out.println(AddNot("Not Nice"));
    }
    public static String AddNot(String param1){
        if(param1.contains("Not")){
            return param1;
        }
        return "Not" + " " + param1;
    }
}
