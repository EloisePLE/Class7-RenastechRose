package Day26_ClassesandConstructors;

import HomeworkClasses.MonkeyClass;

public class Homework41 {
    public static void main(String[] args) {
        /*
        We have two monkeys, MonkeyA and MonkeyB.
        We are in trouble if they are both smiling or if neither of them is smiling.
        Return true if we are in trouble.
        Please create a Class named MonkeyClass. It will have a boolean Field called IsSmiling.
        Please create 2 copy of MonkeyClass and name them MonkeyA and MonkeyB.
        Please create a method that takes 2 booleans. Returns a boolean.
        Name your method as monkeyTrouble.
        Your will pass MonkeyA.IsSmiling and MonkeyB.IsSmiling to your method and you should get below results
        based on if they are smiling or not.
        monkeyTrouble(true, true)   →   true
        monkeyTrouble(false, false)   →   true
        monkeyTrouble(true, false)   →   false
        monkeyTrouble(false, true)   →   false
         */
        MonkeyClass MonkeyA = new MonkeyClass();
        MonkeyClass MonkeyB = new MonkeyClass();
        MonkeyA.IsSmiling = false;
        MonkeyB.IsSmiling = true;

        System.out.println(monkeyTrouble(MonkeyA.IsSmiling, MonkeyB.IsSmiling));
    }

    public static boolean monkeyTrouble(boolean param1, boolean param2) {
        if ((param1 == true) && (param2 == true)) {
            System.out.println("We are in trouble!");
            return true;
        } else if ((param1 == false) && (param2 == false)){
            System.out.println("We are in trouble!");
            return true;
        } else if ((param1 == false) && (param2 == true)){
            System.out.println("We are good!");
            return false;
        } else
            System.out.println("We are good!");
            return false;

    }
}
