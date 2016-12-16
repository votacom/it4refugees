/**
 * Prints all powers of 2 from 1 to 128
 */
public class PowersOf2 {

    public static void main(String[] args) {

        int number = 1;
        int max = 128;

        while (number <= max) {
            System.out.print(number + ", ");
            number = number * 2; // double the number
        }

    }
}
