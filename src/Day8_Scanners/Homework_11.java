package Day8_Scanners;

import java.text.NumberFormat;
import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
       /* Write a Revenue program where user enters the quantity of the products sold,
        and the price for each product. Then calculate the revenue based on the giving information (hint: Revenue = quantity x price)
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        double qty1 = scan.nextDouble();
        System.out.println("Enter the price($): ");
        double prc1 = scan.nextDouble();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(qty1*prc1);
        System.out.println("Your revenue is: "+result);
    }
}
