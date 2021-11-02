package Algorithms;

public class NthFibonacci {

    public static int recursion(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        return recursion(n-1) +recursion(n-2);

    }

    public static int memoization(int n) {
        return -1;
    }

    public static int iterating(int n) {
        int[] prevTwo = {0,1};
        int counter = 3;

        while (counter <= n) {
            int nextFib = prevTwo[0] + prevTwo[1];
            prevTwo[0] = prevTwo[1];
            prevTwo[1] = nextFib;
            counter++;
        }
        return n > 1 ? prevTwo[1] : prevTwo[0];
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(iterating(5));
    }
}
