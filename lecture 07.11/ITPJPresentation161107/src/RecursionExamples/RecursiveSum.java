package RecursionExamples;

/**
 * Created by lukas on 06.11.2016.
 */
public class RecursiveSum {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumRecursive(n));
        System.out.println(sumIterative(n));
        System.out.println(gaußSum(n));
        System.out.println(isEven(50));
        fact(5);
        //hanoi(3, 'A', 'B', 'C');
    }

    public static int sumRecursive(int n) {
        return n > 0 ? n + sumRecursive(n - 1) : 0;
    }

    public static int sumIterative(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int gaußSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static boolean isOdd(int n) {
        if (n < 0) {
            return isOdd(-n);
        }
        if (n == 1) {
            return true;
        } else {
            return !isEven(n - 2);
        }
        //return n < 0 ? isOdd(-n) : (n==1 ? true : !isEven(n-2));
    }

    public static boolean isEven(int n) {
        if (n < 0) {
            return isEven(-n);
        }
        if (n == 2) {
            return true;
        } else {
            return !isOdd(n - 2);
        }
        //return n < 0 ? isEven(-n) : (n==1 ? true : !isOdd(n-2));

        //return
    }

    // factorial of n; n >= 1; output at begin and end
    private static int fact(int n) {
        System.out.println(" start fact (" + n + ")");
        int r = n <= 1 ? 1 : n * fact(n - 1);
        System.out.println(" end fact (" + n + ") --> " + r);
        return r;
    }

    // move n disks from stack a to stack c
    private static void hanoi(int n, char a, char b, char c) {
        if (n > 0) {
            hanoi(n - 1, a, c, b);
            System.out.println(a + " --> " + c);
            hanoi(n - 1, b, a, c);
        }
    }
}
