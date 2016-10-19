/**
 * Prints the sum of numbers from 1 to 100 divisible by 7,
 * and prints the sum of numbers from 1 to 100 NOT divisible by 7.
 */
public class DivisibleSum {

    public static void main(String[] args) {
        int sum7 = 0;
        int sumNot7 = 0;

        for (int i = 1; i <= 100; ++i) {
            if ((i % 7) == 0) {
                sum7 += i;
            } else {
                sumNot7 += i;
            }
        }

        System.out.println("Sum of numbers divisible: " + sum7);
        System.out.println("Sum of numbers not divisible: " + sumNot7);

    }
}
