import java.util.Scanner;

/*
On a piano, a key has a frequency, say f0. Each higher key (black or white) has a frequency of f0 * rn, where n is the distance (number of keys) from that key, and r is 2(1/12). Given an initial key frequency, output that frequency and the next 3 higher key frequencies.

Output each floating-point value with two digits after the decimal point, then the units ("Hz"), then a newline, using the following statement:
System.out.printf("%.2f Hz\n", yourValue);

Ex: If the input is:

440.0

(which is the A key near the middle of a piano keyboard), the output is:

440.00 Hz
466.16 Hz
493.88 Hz
523.25 Hz

Note: To compute the next 3 higher key frequencies, use one statement to compute r = 2^(1/12) using the pow function. Then use that r in subsequent statements that use the formula
f_n = f0 * r^n with n being 1, 2, and finally 3.
 */
public class MusicalNoteFrequencies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */

    }
}
