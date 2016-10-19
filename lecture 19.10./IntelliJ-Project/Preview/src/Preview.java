import java.util.Scanner;

/**
 * A simple demo program to show what will be learned next time
 */
public class Preview {

    public static void main(String[] args) {
        String[] names = new String[0]; // an array where we will save the names for the candidates

        Scanner inputScanner = new Scanner(System.in); // the scanner that will read the user input

        boolean stillListingCandidates = true; // if true, the program will keep asking for more candidate names.

        System.out.println("Hello and welcome to the lottery!");
        while(stillListingCandidates) {
            System.out.println("Who wants to be a winner? Please enter a name of a candidate:");
            String name = inputScanner.next(); // read the name from user input
            names = addToArray(names, name); // add the name to our array of names
            System.out.println("Very nice, " + name + ". Are there other candidates? (Type \"yes\" or \"no\"):");
            String choice = inputScanner.next(); // read the choice of the user (yes or no)
            if ("yes".equals(choice)) {
                // do nothing, stillListingCandidates is still true.
            } else if ("no".equals(choice)) {
                stillListingCandidates = false; // user wants to start the drawing... so exciting!
            } else { // oh my, the user could not decide!
                System.out.println("I am very sorry, I only understand \"yes\" and \"no\". I suppose you said: yes.");
                // again, at "yes", we have to do nothing.
            }
        }
        // the loop has ended,so we want to draw the winner!
        System.out.println();
        System.out.println("Aaaaaaaaaaand the winner iiiiiiis ----");
        String winner = chooseAny(names);
        System.out.println();
        System.out.println(winner);
        System.out.println();
        System.out.println("Congratulations to " + winner + "!");
        System.out.println("And to all the others: see you next time at the lottery!");
    }

    /**
     * takes an array of strings and some single string and
     * returns a new array with the contents of the given array,
     * plus the given string at the very end.
     *
     * @param anArray        any array of strings
     * @param somethingToAdd any string that should be added to the array
     * @return a new array of the length of the given array, plus 1,
     * filled with the values of the old array plus the given string.
     */
    public static String[] addToArray(String[] anArray, String somethingToAdd) {
        String[] newArray = new String[anArray.length + 1];
        for (int i = 0; i < anArray.length; ++i) {
            newArray[i] = anArray[i];
        }
        newArray[newArray.length - 1] = somethingToAdd;
        return newArray;
    }

    /**
     * takes an array of strings and chooses any of these string to return
     * @param anArray an array of strings
     * @return some element of the array
     */
    public static String chooseAny(String[] anArray) {
        // let's make some weird math here:
        int a = anArray.length % 3;
        int b = a*5;
        int c = b % 7;
        int d = c * 11;
        int e = d % anArray.length;
        return anArray[e];
    }
}
