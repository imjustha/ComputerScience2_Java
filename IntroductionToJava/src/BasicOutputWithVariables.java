import java.util.Scanner;

/*
A variable like userNum can store a value like an integer.
Extend the given program as indicated.

Output the user's input. (2 pts)
Output the input squared and cubed. Hint: Compute squared as userNum * userNum. (2 pts)
Get a second user input into userNum2, and output the sum and product. (1 pt)


Enter integer:
4
You entered: 4
4 squared is 16
And 4 cubed is 64!!
Enter another integer:
5
4 + 5 is 9
4 * 5 is 20

 */
public class BasicOutputWithVariables {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;

        System.out.println("Enter integer:");
        userNum = scnr.nextInt();

        /* Type your code here */
        System.out.println("You entered: " + userNum);
        System.out.println(userNum + " squared is " + (userNum * userNum));
        System.out.println("And " + userNum + " cubed is " + (userNum * userNum * userNum) + "!!");
        System.out.println("Enter another integer:");

        int anotherNum = scnr.nextInt();
        System.out.println(userNum + " + " + anotherNum + " is " + (userNum + anotherNum));
        System.out.println(userNum + " * " + anotherNum + " is " + (userNum * anotherNum));
    }
}
