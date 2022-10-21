package Day5_IfElseStatements;

public class CodingTask2 {
    public static void main(String[] args) {

        String firstName = "Jack";
        String lastName = "Man";
        int creditScore = 800;

        if (creditScore < 500){
            System.out.println(firstName + " " + lastName + " has a Bad Credit Score");
        } else if (creditScore <= 500 && creditScore > 700) {
            System.out.println(firstName + " " + lastName + " has Average Credit Score");
        } else if (creditScore >= 700 && creditScore < 750) {
            System.out.println(firstName + " " + lastName + " has a Good Credit Score");
        } else
            System.out.println(firstName + " " + lastName + " has a Great Credit Score");
    }
}
