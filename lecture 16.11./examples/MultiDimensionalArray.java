/**
 * Created by Florian on 16.11.16.
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {

        //Array of Arrays
        //Create multi Dimensional Array
        int myGrid[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Print multi dimensional Array
        System.out.println(myGrid[0][0] + "," + myGrid[0][1] + "," + myGrid[0][2]);
        System.out.println(myGrid[1][0] + "," + myGrid[1][1] + "," + myGrid[1][2]);
        System.out.println(myGrid[2][0] + "," + myGrid[2][1] + "," + myGrid[2][2]);



    }
}
