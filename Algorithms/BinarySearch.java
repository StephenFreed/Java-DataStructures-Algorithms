/*
Implementation of binary search.
Returns index of target value from sorted array.
Returns -1 if target value does not exist in array.
 */

package Algorithms;

public class BinarySearch {

    // binary search method implementation
    public static int binarySearch(int[] array, int targetValue) {
        int leftPointerIdx = 0;
        int rightPointerIdx = array.length;

        while (leftPointerIdx < rightPointerIdx) {
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
        int target = 73;
        System.out.println(binarySearch(intArray,target));
    }
}
