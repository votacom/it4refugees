/**
 * Created by julian on 09.11.16.
 */
public class Diamond {
    /*
    Exercise5)

    Implement a function called 'drawDiamond' taking a parameter int called h.
    This function should print a diamond like this, where h is the 'height' of the diamond, so for e.g. h=9:
        1
       222
      33333
     4444444
    555555555
     4444444
      33333
       222
        1
     You are going to need odd numbers to do this, so just print 'No valid input!' if an even number or a number smaller
     than 0 is given. In case of 0 just leave the function right away without printing anything.


*/

    public static void main(String[] args) {
        //use this method to test your function

        drawDiamond(9);

    }

    public static void drawDiamond(int h) {
        if (h % 2 == 0) {
            System.out.println("No valid input!");
            return;
        }

        int maxNumber = (h - 1) / 2;
        int symbolCount = 1;

        for (int row = 0; row < maxNumber; row++) {

            for (int s = maxNumber - row; s > 0; s--) {
                System.out.print(" ");
            }

            for (int n = 0; n < symbolCount; n++) {
                System.out.print(row + 1);
            }

            System.out.println();
            symbolCount = symbolCount + 2;
        }

        //row
        for (int row = maxNumber; row >= 0; row--) {

            //spaces
            for (int s = maxNumber - row; s > 0; s--) {
                System.out.print(" ");
            }

            //numbers
            for (int n = 0; n < symbolCount; n++) {
                System.out.print(row + 1);
            }

            //linebreak
            System.out.println();
            symbolCount = symbolCount - 2;
        }
    }

}
