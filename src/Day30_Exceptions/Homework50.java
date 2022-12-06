package Day30_Exceptions;

public class Homework50 {
    /*
    Write a Car Class where it has the following attributes:
    1) String Model
    2) int Year
    3) double speed
    and following methods:
    1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
    2) PrintCar() - Where it prints each objects attributes
    3) IncreaseSpeed() - Where it takes a double value, and it increases the Speed attribute by input amount
    4) DecreaseSpeed() - Where it takes a double value, and it decreases the Speed attribute by input amount

    Create 4 instance of Car Class, after Setting the Attribute values,
    Apply increaseSpeed and DecreaseSpeed Multiple times for different values.
    For those which has speed of 80 or more, Print warning such as Model Year, Speed and "Danger of getting ticket!"
    Example: Tesla 2021, Speed: 106. Danger of getting ticket!
     */
    public static void main(String[] args) {
        Car myToyota = new Car();
        myToyota.setAttributes("Sienna", 2022, 90);
        myToyota.increaseSpeed(15);
        myToyota.decreaseSpeed(20.5);
        myToyota.decreaseSpeed(30);
        if(myToyota.Speed > 80){
            myToyota.printCar();
            System.out.print("Danger of getting a ticket!");
        }

        Car myBMW = new Car();
        myBMW.setAttributes("i4 M50", 2022, 120);
        myBMW.decreaseSpeed(40);
        myBMW.increaseSpeed(30.5);
        myBMW.decreaseSpeed(10);
        if(myBMW.Speed > 80){
            myBMW.printCar();
            System.out.println("Danger of getting a ticket!");
        }

        Car myNissan = new Car();
        myNissan.setAttributes("Ariya", 2023, 110);
        myNissan.increaseSpeed(50);
        myNissan.decreaseSpeed(30);
        myNissan.decreaseSpeed(60);
        if(myNissan.Speed > 80){
            myNissan.printCar();
            System.out.println("Danger of getting a ticket!");
        }

        Car myMercedes = new Car();
        myMercedes.setAttributes("EQ", 2023, 115);
        myMercedes.increaseSpeed(100);
        myMercedes.decreaseSpeed(60.5);
        myMercedes.decreaseSpeed(10);
        if(myMercedes.Speed > 80){
            myMercedes.printCar();
            System.out.println("Danger of getting a ticket!");
        }
    }
}

class Car{
    String Model;
    int Year;
    double Speed;

    public void setAttributes(String param1, int param2, double param3){
        Model = param1;
        Year = param2;
        Speed = param3;
    }
    public void printCar(){
        System.out.print(Model+" ");
        System.out.print(Year+", ");
        System.out.print(" Speed: "+Speed+". ");

    }
    public void increaseSpeed(double param1){
        Speed = Speed + param1;
    }
    public void decreaseSpeed(double param1){
        Speed = Speed - param1;
    }
}
