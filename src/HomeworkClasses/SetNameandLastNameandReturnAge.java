package HomeworkClasses;

public class SetNameandLastNameandReturnAge {
    public String FirstAndLastNames;
    private Integer Age = 34;

    public SetNameandLastNameandReturnAge(String param1, int param2){
        FirstAndLastNames = param1;
        Age = param2;
    }

    public Integer PrintNamesReturnAge(){
        System.out.println(FirstAndLastNames);
        return Age;
    }
}
