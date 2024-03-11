import java.util.Scanner;

/*
Note: Creating multiple Scanner objects for the same input stream yields unexpected behavior. Thus, as good practice is to use a single Scanner object for reading input from System.in. That Scanner object can be passed as an argument to any methods that read input.

(1) Prompt the user to enter a string of their choosing. Store the text in a string. Output the string. (1 pt)

Ex:

Enter a sample text:
We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

You entered: We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

(2) Implement the printMenu() method to print the following command menu. (1 pt)

Ex:

MENU
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit

(3) Implement the executeMenu() method that takes 3 parameters: a character representing the user's choice, the user provided sample text, and a Scanner object. executeMenu() performs the menu options, according to the user's choice, by calling the appropriate methods described below. (1 pt)


(4) In the main() method, call printMenu() and prompt for the user's choice of menu options for analyzing/editing the string. Each option is represented by a single character.

If an invalid character is entered, continue to prompt for a valid choice. When a valid option is entered, execute the option by calling executeMenu(). Then, print the menu, and prompt for a new option. Continue until the user enters 'q'. Hint: Implement Quit before implementing other options. (1 pt)

Ex:

MENU
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit

Choose an option:

(5) Implement the getNumOfNonWSCharacters() method. getNumOfNonWSCharacters() has a string as a parameter and returns the number of characters in the string, excluding all whitespace. Call getNumOfNonWSCharacters() in the executeMenu() method, and then output the returned value. (4 pts)

Ex:

Enter a sample text:
We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

You entered: We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue!

MENU
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit

Choose an option:
c
Number of non-whitespace characters: 181

(6) Implement the getNumOfWords() method. getNumOfWords() has a string as a parameter and returns the number of words in the string. Hint: Words end when a space is reached except for the last word in a sentence. Call getNumOfWords() in the executeMenu() method, and then output the returned value. (3 pts)

Ex:

Number of words: 35

(7) Implement the findText() method, which has two strings as parameters. The first parameter is the text to be found in the user provided sample text, and the second parameter is the user provided sample text. The method returns the number of instances a word or phrase is found in the string. In the executeMenu() method, prompt the user for a word or phrase to be found. Then call findText() and output the returned value. (3 pts)

Ex:

Enter a word or phrase to be found:
more
"more" instances: 5

(8) Implement the replaceExclamation() method. replaceExclamation() has a string parameter and returns a string which replaces each '!' character in the string with a '.' character. replaceExclamation() DOES NOT output the string. Call replaceExclamation() in the executeMenu() method, and then output the edited string. (3 pts)

Ex.

Edited text: We'll continue our quest in space.  There will be more shuttle flights and more shuttle crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  our hopes and our journeys continue.

(9) Implement the shortenSpace() method. shortenSpace() has a string parameter and returns a string that replaces all sequences of 2 or more spaces with a single space. shortenSpace() DOES NOT output the string. Call shortenSpace() in the executeMenu() method, and then output the edited string. (3 pt)

Ex:

Edited text: We'll continue our quest in space. There will be more shuttle flights and more shuttle crews and, yes, more volunteers, more civilians, more teachers in space. Nothing ends here; our hopes and our journeys continue!

 */
public class AuthoringAssistant {
    /* Define your methods here. */

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
    }
}
