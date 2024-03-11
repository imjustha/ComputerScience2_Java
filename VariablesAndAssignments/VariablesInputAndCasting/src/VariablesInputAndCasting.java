import java.util.Scanner;

/*
(1) Prompt the user to input an integer, a double, a character, and a string, storing each into separate variables. Then, output those four values on a single line separated by a space. (2 pts)
Enter integer:
99
Enter double:
3.77
Enter character:
z
Enter string:
Howdy
99 3.77 z Howdy

(2) Extend to also output in reverse. (1 pt)
Enter integer:
99
Enter double:
3.77
Enter character:
z
Enter string:
Howdy
99 3.77 z Howdy
Howdy z 3.77 99

(3) Extend to cast the double to an integer, and output that integer. (2 pts)
Enter integer:
99
Enter double:
3.77
Enter character:
z
Enter string:
Howdy
99 3.77 z Howdy
Howdy z 3.77 99
3.77 cast to an integer is 3
 */
public class VariablesInputAndCasting {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt;
        double userDouble;
        // FIXME Define char and string variables similarly

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // FIXME (2): Output the four values in reverse

        // FIXME (3): Cast the double to an integer, and output that integer
    }
}
