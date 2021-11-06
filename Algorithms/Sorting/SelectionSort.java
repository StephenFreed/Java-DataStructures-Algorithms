package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int smallestIdx = i;
            for(int j = i + 1; j < array.length; j++) {

                if (array[smallestIdx] > array[j]) {
                    smallestIdx = j;
                }
            }

            if (smallestIdx != i) {
                int temp = array[i];
                array[i] = array[smallestIdx];
                array[smallestIdx] = temp;
            }

        }

        return array;
    }

    public static void main(String[] args) {
        int[] testSelectionSort = {10,20,18,15,43,2,1,6};
        int[] sortedSelectionSort = selectionSort(testSelectionSort);
        System.out.println(Arrays.toString(sortedSelectionSort));
    }
}
