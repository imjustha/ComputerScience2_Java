/*
Write a program that finds word differences between two sentences. The input begins with an integer indicating the number of words in each sentence. The next input line is the first sentence and the following input line is the second sentence. Assume that the two sentences have the same number of words and no more than 20 words each.

The program displays word pairs that differ between the two sentences. One pair is displayed per line.

Ex: If the input is:

6
Smaller cars get better gas mileage
Tiny cars get great fuel economy
then the output is:

Smaller Tiny
better great
gas fuel
mileage economy
Add a method named readSentences to read the input sentences into two String arrays.

public static void readSentences(Scanner scnr, String[] sentence1Words, String[] sentence2Words, int wordCount)

main() already contains code to read the word count and call readSentences(). Complete main() to display differing word pairs.
 */
public class ReplacementWords {
    /* Define your method here */

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] sentence1Words = new String[20];
        String[] sentence2Words = new String[20];
        int wordCount;

        // Read the number of words per sentence
        wordCount = scnr.nextInt();

        // Call readSentences() to populate arrays
        readSentences(scnr, sentence1Words, sentence2Words, wordCount);

        // Display differing word pairs
        /* Type your code here. */

    }
}
