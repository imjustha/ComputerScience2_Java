/*
Write a program that first gets a list of integers from input. The input begins with an integer indicating the length of the list that follows. Then, get the last value from the input, and output all integers less than or equal to that value. Assume that the list will always contain less than 20 integers.

Ex: If the input is:

5
50 60 140 200 75
100
the output is:

50 60 75
The 5 indicates that there are five integers in the list, namely 50, 60, 140, 200, and 75. The 100 indicates that the program should output all integers less than or equal to 100, so the program outputs 50, 60, and 75. For coding simplicity, follow every output value by a space, including the last one.

Such functionality is common on sites like Amazon, where a user can filter results. Utilizing methods helps to make main() very clean and intuitive.

The program must define the following two methods:
public static void getUserValues(int[] myArr, int arrSize, Scanner scnr) - read arrSize integers and store the integers in myArr.

public static int intsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold, int[] resValues) - store in resValues values of userValues that are less than or equal to upperThreshold. Return the number of integers in resValues.

 */
public class OutputValuesBelowAnAmountMethods {
}
