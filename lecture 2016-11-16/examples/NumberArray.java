/**
 * Created by Florian on 16.11.16.
 */
public class NumberArray {

    public static void main(String[] args) {
        int[] numberArray = makeNumberArray(5);

        for(int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
    }

    public static int[] makeNumberArray(int length) {
        int[] myArray = new int[length];
        int number = 0;
        for (int i = 0; i < length; i++) {
            number++;
            myArray[i] = number;
        }
        return myArray;
    }




}
