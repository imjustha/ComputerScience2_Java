/*
Given main() and the Instrument class, define a derived class, StringInstrument, with methods to set and get private fields of the following types:

int to store the number of strings
int to store the number of frets
boolean to store whether the instrument is bowed
Ex. If the input is:

Drums
Zildjian
2015
2500
Guitar
Gibson
2002
1200
6
19
false
the output is:

Instrument Information:
   Name: Drums
   Manufacturer: Zildjian
   Year built: 2015
   Cost: 2500
Instrument Information:
   Name: Guitar
   Manufacturer: Gibson
   Year built: 2002
   Cost: 1200
   Number of strings: 6
   Number of frets: 19
   Is bowed: false
 */
public class InstrumentInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Instrument myInstrument = new Instrument();
        StringInstrument myStringInstrument = new StringInstrument();

        String instrumentName, manufacturerName, stringInstrumentName, stringManufacturer;
        int yearBuilt, cost, stringYearBuilt, stringCost, numStrings, numFrets;
        boolean bowed;

        instrumentName = scnr.nextLine();
        manufacturerName = scnr.nextLine();
        yearBuilt = scnr.nextInt();
        scnr.nextLine();
        cost = scnr.nextInt();
        scnr.nextLine();
        stringInstrumentName = scnr.nextLine();
        stringManufacturer = scnr.nextLine();
        stringYearBuilt = scnr.nextInt();
        stringCost = scnr.nextInt();
        numStrings = scnr.nextInt();
        numFrets = scnr.nextInt();
        bowed = scnr.nextBoolean();

        myInstrument.setName(instrumentName);
        myInstrument.setManufacturer(manufacturerName);
        myInstrument.setYearBuilt(yearBuilt);
        myInstrument.setCost(cost);
        myInstrument.printInfo();

        myStringInstrument.setName(stringInstrumentName);
        myStringInstrument.setManufacturer(stringManufacturer);
        myStringInstrument.setYearBuilt(stringYearBuilt);
        myStringInstrument.setCost(stringCost);
        myStringInstrument.setNumOfStrings(numStrings);
        myStringInstrument.setNumOfFrets(numFrets);
        myStringInstrument.setIsBowed(bowed);
        myStringInstrument.printInfo();

        System.out.println("   Number of strings: " + myStringInstrument.getNumOfStrings());
        System.out.println("   Number of frets: " + myStringInstrument.getNumOfFrets());
        System.out.println("   Is bowed: " + myStringInstrument.getIsBowed());
    }
}
