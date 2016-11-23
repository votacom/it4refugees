/**
 * We want to write a program that takes an Array of Strings and prints them in a rectangular frame, one per line.
 * For example, the array {"Hello", "World", "in", "a", "frame"} would be printed as:
 *
 *  *********
 *  * Hello *
 *  * World *
 *  * in    *
 *  * a     *
 *  * frame *
 *  *********
 */
public class FrameReferenceImplementation {

    public static void main(String[] args) {
        String[] words = {"Hello", "World", "in", "a", "frame"};
        int stars = getMaxLength(words) + 4;
        printStars(stars);
        printWords(words);
        printStars(stars);
    }

    public static int getMaxLength(String[] words) {
        int length = 0;

        for(int i = 0;i < words.length;i++) {
            if(words[i].length() > length) {
                length = words[i].length();
            }
        }

        return length;
    }

    public static void printStars(int amount) {
        for(int i = 0;i < amount;i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static String getFramedWord(String word, int maxLength) {
        String framedWord = "* " + word;
        int diff = maxLength - word.length();

        for(int i = 0;i < diff;i++) {
            framedWord += " ";
        }

        return framedWord + " *";
    }

    public static void printWords(String[] words) {
        int maxLength = getMaxLength(words);
        for(int i = 0;i < words.length;i++) {
            System.out.println(getFramedWord(words[i], maxLength));
        }
    }

}
