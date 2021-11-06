package Algorithms;

/*
implementation of binary search. must be sorted first.
returns index of target value from sorted array.
Returns -1 if target value does not exist in array.
O(log(n)) Time | O(log(n)) Space
 */

public class BinarySearch {

    // binary search method implementation
    public static int binarySearch(int[] array, int targetValue) {
        int leftPointerIdx = 0;
        int rightPointerIdx = array.length -1;

        while (leftPointerIdx <= rightPointerIdx) {
            int midIdx = Math.floorDiv(leftPointerIdx + rightPointerIdx, 2);
            int midValue = array[midIdx];

            if (midValue == targetValue) {
                return midIdx;
            } else if (targetValue > midValue) {
                leftPointerIdx = midIdx + 1;
            } else {
                rightPointerIdx = midIdx;
            }
        }
        // returns -1 if while loop completes without finding targetValue
        return -1;
    }


    public static void main(String[] args) {
        int[] intArray = {1,3,7,9,11,14,22,43,57,63,73,88,89,100,123,142,1732,1894};
        int target = 63;
        System.out.println(binarySearch(intArray,target));
    }
}
