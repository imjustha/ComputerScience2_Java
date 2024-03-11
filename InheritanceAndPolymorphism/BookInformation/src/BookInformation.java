/*
Given main() and a base Book class, define a derived class called Encyclopedia with member methods to get and set private fields of the following types:

String to store the edition
int to store the number of pages
Within the derived Encyclopedia class, define a printInfo() method that overrides the Book class' printInfo() method by printing the title, author, publisher, publication date, edition, and number of pages.

Ex. If the input is:

The Hobbit
J. R. R. Tolkien
George Allen & Unwin
21 September 1937
The Illustrated Encyclopedia of the Universe
Ian Ridpath
Watson-Guptill
2001
2nd
384
the output is:

Book Information:
   Book Title: The Hobbit
   Author: J. R. R. Tolkien
   Publisher: George Allen & Unwin
   Publication Date: 21 September 1937
Book Information:
   Book Title: The Illustrated Encyclopedia of the Universe
   Author: Ian Ridpath
   Publisher: Watson-Guptill
   Publication Date: 2001
   Edition: 2nd
   Number of Pages: 384
Note: Indentations use 3 spaces.
 */

import java.util.Scanner;

public class BookInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Book myBook = new Book();
        Encyclopedia myEncyclopedia = new Encyclopedia();

        String title, author, publisher, publicationDate;
        String eTitle, eAuthor, ePublisher, ePublicationDate, edition;
        int numPages;

        title = scnr.nextLine();
        author = scnr.nextLine();
        publisher = scnr.nextLine();
        publicationDate = scnr.nextLine();

        eTitle = scnr.nextLine();
        eAuthor = scnr.nextLine();
        ePublisher = scnr.nextLine();
        ePublicationDate = scnr.nextLine();
        edition = scnr.nextLine();
        numPages = scnr.nextInt();

        myBook.setTitle(title);
        myBook.setAuthor(author);
        myBook.setPublisher(publisher);
        myBook.setPublicationDate(publicationDate);
        myBook.printInfo();

        myEncyclopedia.setTitle(eTitle);
        myEncyclopedia.setAuthor(eAuthor);
        myEncyclopedia.setPublisher(ePublisher);
        myEncyclopedia.setPublicationDate(ePublicationDate);
        myEncyclopedia.setEdition(edition);
        myEncyclopedia.setNumPages(numPages);
        myEncyclopedia.printInfo();

    }
}