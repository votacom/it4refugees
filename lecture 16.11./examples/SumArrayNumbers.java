/**
 * Created by Florian on 16.11.16.
 */
public class SumArrayNumbers {
    public static void main(String[] args) {

        //Create new Array
        int[] myArray = new int[5];

        //Fill Array with data
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        //Sum numbers in array
        int sum = 0;
        for(int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        //Print Result
        System.out.println("The sum of numbers in the array is: " + sum);

    }
}
