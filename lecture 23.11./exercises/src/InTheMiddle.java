/**
 * Write a function that returns the "middle" element of an array.
 *
 * For example, if the array contains five elements, you should return
 * the third element.
 *
 * For arrays with an even number of elements, return the one that has
 * the index matching half of the array's length.
 */
public class InTheMiddle {

    public static void main(String[] args) {
        String[] oddNumberOfElements = {"One", "Two", "Three", "Four", "Five"};
        String oddResult = getMiddleElement(oddNumberOfElements); // should return "Three"

        String[] evenNumberOfElements = {"One", "Two", "Three", "Four"};
        String evenResult = getMiddleElement(evenNumberOfElements); // should return "Two"
    }

    public static String getMiddleElement(String[] array) {
        return "";
    }

}
