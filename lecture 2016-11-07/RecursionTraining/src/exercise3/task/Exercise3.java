package exercise3.task;

/*
    Exercise 3) change recursion to iteration

    try to understand what the function 'rec' does and try to write a new function 'iter' doing the same as 'rec'
    using iteration (loops). the header of the new function 'iter' should be the same as the one of 'rec' (same
    parameters and same return value)

*/

public class Exercise3 {

        public static int rec(int x, int y) {
            if (x < 0) {
                return rec(-x, y);
            }
            if (y < 0) {
                return rec(x, -y);
            }
            if (x == 0) {
                return 0;
            }
            if (x > y) {
                return rec(y, x);
            }
            if (x == y) {
                return x;
            }
            return rec(x, y - x);
        }

        // TODO: implement here

        public static void main(String[] args) {
        }

}
