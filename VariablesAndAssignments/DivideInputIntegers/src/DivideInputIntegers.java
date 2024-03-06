/*
Write a program that reads integers userNum and divNum as input,
and outputs userNum divided by divNum three times. Note: End with a newline.

Ex: If the input is:

2000 2

the output is:

1000 500 250
 */
public class DivideInputIntegers {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scn = new Scanner(System.in);

        int userNum;
        int divNum;

        userNum = scn.nextInt();
        divNum = scn.nextInt();

        userNum /= divNum;

        System.out.print(userNum + " ");
        userNum /= divNum;
        System.out.print(userNum+ " ");
        userNum /= divNum;
        System.out.println(userNum);
    }
}
