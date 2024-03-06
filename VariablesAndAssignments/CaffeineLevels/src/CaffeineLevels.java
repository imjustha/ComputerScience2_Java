import java.util.Scanner;

/*
A half-life is the amount of time it takes for a substance or entity to fall to half its original value.
Caffeine has a half-life of about 6 hours in humans.
Given caffeine amount (in mg) as input, output the caffeine level after 6, 12, and 24 hours.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("After 6 hours: %.2f mg\n", yourValue);

Ex: If the input is:
100

the output is:

After 6 hours: 50.00 mg
After 12 hours: 25.00 mg
After 24 hours: 6.25 mg

 */
public class CaffeineLevels {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.

        caffeineMg = scnr.nextDouble();
        /* Type your code here. */

    }
}
