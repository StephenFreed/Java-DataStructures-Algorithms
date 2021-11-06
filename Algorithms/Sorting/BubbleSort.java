/*
implementation of bubble sort
O(n^2) DataStructures.Time | O(1) Space
 */

package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    // returns sorted array
    public static int[] bubbleSort(int[] array) {
        boolean isSorted;
        // first loop
        for (int i = 0; i < array.length; i++) {
            // second loop
            isSorted = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    // helper function to swap
                    swap(array,j - 1, j);
                    isSorted = false;
                }
            }
            // check if sorted for better performance
            if (isSorted) {
                return array;
            }

        }
        return array;
    }

    // swap helper function
    private static void swap(int [] array, int largerIdx, int smallerIdx) {
        int tempValue = array[smallerIdx];
        array[smallerIdx] = array[largerIdx];
        array[largerIdx] = tempValue;
    }

    // main method
    public static void main(String[] args) {
        int[] testBubbleSort = {10,20,18,15,43,2,1,6};
        int[] sortedBubbleSort = bubbleSort(testBubbleSort);
        System.out.println(Arrays.toString(sortedBubbleSort));
    }

}
