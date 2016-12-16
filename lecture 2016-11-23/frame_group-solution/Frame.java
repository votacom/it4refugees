/**
 * Created by Alex/Johannes on 23.11.2016.
 */
public class Frame {

    public static void main(String[] args) {

        String[] words = {"Hello", "coders", "lets", "program", "something"};
        int maxLength = getMaxLength(words);
        int numberOfStars = maxLength + 4;

        // first line of stars
        printStars(numberOfStars);

        // print all the words into the box
        for (String currentWord : words) {
            printFrameLine(currentWord, maxLength);
        }

        // print the last line of stars
        printStars(numberOfStars);
    }

    /*
     * Prints a word between stars and fills up the remaining space with ' '
     */
    public static void printFrameLine(String word, int maxLength) {
        System.out.print("* ");
        System.out.print(word);

        int difference = maxLength - word.length();
        for (int i=0; i < difference; i++) {
            System.out.print(' ');
        }

        System.out.println(" *");
    }

    /*
     * Prints <numberOfStars> stars and a newline
     */
    public static void printStars(int numberOfStars) {
        for(int i=0; i < numberOfStars; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    /*
     * Returns the length of the longest word
     */
    public static int getMaxLength(String[] words) {
        int currentLength = 0;
        int biggest = 0;

        for (String currentWord : words) {
            currentLength = currentWord.length();

            if (currentLength > biggest) {
                biggest = currentLength;
            }
        }

        return biggest;
    }
}
