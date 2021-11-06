/*
given a 2D array rotate the matrix 90 degrees
the first row in the matrix holds the matrix rows and then columns
return new matrix
 */

package Algorithms;

public class RotateMatrix {
    public static void rotate90(int[][] matrix) {
        // input matrix lengths
        int rowLength = matrix[0][0];
        int colLength = matrix[0][1];

        // create new array with switched row and col lengths
        int [][] answer = new int[colLength][rowLength];
        // loop through row and col idx
        for (int rowIdx = 0; rowIdx < rowLength; rowIdx++) {
            for (int colIdx = 0; colIdx < colLength; colIdx++) {
                // start matrix row count at index 1
                // answer row is set by colIdx
                // answer col starts at last col and works backward from parent loop
                int newRow = colIdx;
                int newCol = rowLength - rowIdx - 1;
                answer[newRow][newCol] = matrix[rowIdx + 1][colIdx];
            }
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{5,4},{1,2,3,1},{4,5,6,1},{7,8,9,1},{10,11,12,11},{13,14,15,11}};

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===== Rotated 90 ========");

        rotate90(matrix);

    }
}
