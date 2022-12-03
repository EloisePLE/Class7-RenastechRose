package StudySession_Week9;

public class City {

    public String name;
    public long population;
    public String aliasName;

    public static String cityOfState = "State of New York";
    public static String CapitalOftheState = "Albany";

    public void display() {
        System.out.println("City's name is : " + name);
        System.out.println("City's population is : " + population);
        System.out.println("This City's alias is : " + aliasName);
    }

    public void nyCommons() {
        System.out.println("Capital of NY State : " + CapitalOftheState);
    }

    static int add(int a, int b) {
        return a + b;
    }
}
