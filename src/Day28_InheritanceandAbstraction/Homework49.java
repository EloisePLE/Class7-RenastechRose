package Day28_InheritanceandAbstraction;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Homework49 {
    /*
    Write a Class and name it Shoes that has the following attributes:
    1) Brand
    2) Size
    3) Type
    4) Price
    Also has the following methods:
    1) SetInfo(): Where it Takes String brand, double size, String Type and double price to Set the attributes
    2) Print(): Where it prints the value of attributes.

    Create 4 different Object (Class Instance) of Shoes Class, and add it to an ArrayList.
    Print all the Shoe instances that has price over 10,
    Apply discount for those 15% off on the ones that has Price of 50 or over.
     */
    public static void main(String[] args) {
        ArrayList<Shoes> myShoes = new ArrayList<>();
        Shoes myFirstShoes = new Shoes();
        myFirstShoes.setInfo("Skechers", 8, "Comfort Shoes", 99.99);

        Shoes mySecondShoes = new Shoes();
        mySecondShoes.setInfo("Vince Camuto", 8, "Loafers & Oxfords", 179.99);

        Shoes myThirdShoes = new Shoes();
        myThirdShoes.setInfo("Columbia", 8.5, "Winter Boots", 149.99);

        Shoes myFourthShoes = new Shoes();
        myFourthShoes.setInfo("Call it Spring", 8, "Sandals", 59.99);

        myShoes.add(myFirstShoes);
        myShoes.add(mySecondShoes);
        myShoes.add(myThirdShoes);
        myShoes.add(myFourthShoes);

        for (int i = 0; i < myShoes.size(); i++) {
            Shoes offShoes = myShoes.get(i);
            if (offShoes.Price > 10) {
                offShoes.printInfo();
            }
            if (offShoes.Price > 50) {
                offShoes.Price = offShoes.Price * 0.85;
                NumberFormat currency = NumberFormat.getCurrencyInstance();
                String result = currency.format(offShoes.Price);
                System.out.println(offShoes.Brand + " is 15% off. The final price is: "+result);
                System.out.println("________________________________________________");
            }
        }
    }
}
    class Shoes {
        String Brand;
        double Size;
        String Type;
        double Price;

        public void setInfo(String param1, double param2, String param3, double param4) {
            Brand = param1;
            Size = param2;
            Type = param3;
            Price = param4;

        }
        public void printInfo(){
            System.out.println("Brand: "+Brand);
            System.out.println("Size: "+Size);
            System.out.println("Type: "+Type);
            System.out.println("Price: "+Price);
        }
    }

