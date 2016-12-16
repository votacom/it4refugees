/**
 * Prints decrementing counter values
 */
public class Counter {

    public static void main(String[] args) {
        int counter = 3;

        while (counter > 0) {
            System.out.println("Value of the counter is " + counter);
            counter = counter - 1;
        }

    }
}
