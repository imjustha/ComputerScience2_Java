/*

The base class Pet has protected fields petName, and petAge. The derived class Cat extends the Pet class and includes a private field for catBreed. Complete main() to:

create a generic pet and print information using printInfo().
create a Cat pet, use printInfo() to print information, and add a statement to print the cat's breed using the getBreed() method.
Ex. If the input is:

Dobby
2
Kreacher
3
Scottish Fold
the output is:

Pet Information:
   Name: Dobby
   Age: 2
Pet Information:
   Name: Kreacher
   Age: 3
   Breed: Scottish Fold
 */
public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Cat myCat = new Cat();

        String petName, catName, catBreed;
        int petAge, catAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();
        catName = scnr.nextLine();
        catAge = scnr.nextInt();
        scnr.nextLine();
        catBreed = scnr.nextLine();

        // TODO: Create generic pet (using petName, petAge) and then call printInfo

        // TODO: Create cat pet (using catName, catAge, catBreed) and then call printInfo

        // TODO: Use getBreed(), to output the breed of the cat

    }
}
