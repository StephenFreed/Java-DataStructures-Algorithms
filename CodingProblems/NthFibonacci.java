package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {

    public static int recursion(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        return recursion(n-1) + recursion(n-2);

    }

    public static int memoization(int n) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(2,1);
        hashMap.put(1,0);
        return memoization(n, hashMap);
    }

    public static int memoization(int n, Map<Integer,Integer> hashMap) {
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        }
        else {
            hashMap.put(n, memoization(n - 1, hashMap) + memoization(n-2, hashMap));
            System.out.println(hashMap);
            return hashMap.get(n);
        }
    }

    public static int iterating(int n) {
        int[] prevTwo = {0,1};

        for (int nthFib = 3; nthFib <= n; nthFib++) {
            int nextFib = prevTwo[0] + prevTwo[1];
            prevTwo[0] = prevTwo[1];
            prevTwo[1] = nextFib;
        }
        return n > 1 ? prevTwo[1] : prevTwo[0];
    }

    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(iterating(12));
        System.out.println(memoization(12));
    }
}
