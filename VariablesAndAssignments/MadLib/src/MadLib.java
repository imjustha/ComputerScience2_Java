import java.util.Scanner;

/*
Mad Libs are activities that have a person provide various words, which are then used to complete a short story in unexpected (and hopefully funny) ways.

Complete the program to read the needed values from input, that the existing output statement(s) can use to output a short story.

Ex: If the input is:

Eric 12 cars Chipotle

the output is:

Eric buys 12 different types of cars at Chipotle.
 */
public class MadLib {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        int wholeNumber;
        String pluralNoun;
        String genericLocation;

        /* Type your code here. */

        System.out.println(firstName + " buys " + wholeNumber + " different types of " + pluralNoun + " at " + genericLocation + ".");
    }
}
