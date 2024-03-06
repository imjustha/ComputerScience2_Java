import java.util.Scanner;

/*
Sites like Zillow get input about house prices from a database and provide nice summaries for readers.
 Write a program with two inputs, current price and last month's price (both integers).
Then, output a summary listing the price, the change since last month, and the estimated monthly mortgage
computed as (currentPrice * 0.051) / 12. End the last output with a newline.

Ex: If the input is:

200000 210000

the output is:

This house is $200000. The change is $-10000 since last month.
The estimated monthly mortgage is $850.0.
 */

public class HouseRealEstateSummary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int currentPrice;
        int lastMonthsPrice;

        currentPrice = scnr.nextInt();
        lastMonthsPrice = scnr.nextInt();

        /* Type your code here. */
        float mortgage = (float) (currentPrice * 0.051) / 12;
        int change = (int) currentPrice - lastMonthsPrice;
        System.out.println("This house is $" + currentPrice + ". The change is $" + change
                + " since last month.");
        System.out.println("The estimated monthly mortgage is $" + mortgage + ".");
    }
}
