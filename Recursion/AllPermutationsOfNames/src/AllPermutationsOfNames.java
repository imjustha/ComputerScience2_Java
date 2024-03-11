/*
Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings). The program will read a list of one word names into ArrayList nameList (until -1), and use a recursive method to create and output all possible orderings of those names separated by a comma, one ordering per line.

When the input is:

Julia Lucas Mia -1
then the output is (must match the below ordering):

Julia, Lucas, Mia
Julia, Mia, Lucas
Lucas, Julia, Mia
Lucas, Mia, Julia
Mia, Julia, Lucas
Mia, Lucas, Julia
 */
public class AllPermutationsOfNames {
    // TODO: Write method to create and output all permutations of the list of names.
    public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> permList = new ArrayList<String>();
        String name;

        // TODO: Read a list of names into nameList; stop when -1 is read. Then call recursive method.
    }
}
