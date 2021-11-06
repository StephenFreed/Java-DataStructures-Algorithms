package Algorithms.Sorting;

import java.util.Arrays;

/*
implementation of insertion sort
O(n^2) Time | O(1) Space
 */

public class InsertionSort {
    public static int[] insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {

            int startElm = array[i];

            int leftIdx = i - 1;
            int currIdx = i;
            while (leftIdx >= 0 && array[currIdx] < array[leftIdx]) {
                int temp = array[currIdx];
                array[currIdx] = array[leftIdx];
                array[leftIdx] = temp;
                leftIdx--;
                currIdx--;
            }

            array[leftIdx + 1] = startElm;

        }
        return array;
    }

    public static void main(String[] args) {
        int[] testInsertionSort = {10,20,18,15,43,2,1,6};
        int[] sortedInsertionSort = insertionSort(testInsertionSort);
        System.out.println(Arrays.toString(sortedInsertionSort));
    }
}
