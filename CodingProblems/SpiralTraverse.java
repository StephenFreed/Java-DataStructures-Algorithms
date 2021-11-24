package CodingProblems;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int matrixTotal = matrix.length * matrix[0].length;

        while (leftCol <= rightCol && topRow <= bottomRow && answer.size() < matrixTotal) {
            // top
            for (int a = leftCol; a <= rightCol && answer.size() < matrixTotal; a++) {
                answer.add(matrix[topRow][a]);
            }
            // right
            for (int b = topRow + 1; b <= bottomRow && answer.size() < matrixTotal; b++) {
                answer.add(matrix[b][rightCol]);
            }
            // bottom
            for (int c = rightCol - 1; c >= leftCol && answer.size() < matrixTotal; c--) {
                answer.add(matrix[bottomRow][c]);
            }
            // left
            for (int d = bottomRow - 1; d > topRow && answer.size() < matrixTotal; d--) {
                answer.add(matrix[d][leftCol]);
            }
            leftCol++;
            rightCol--;
            topRow++;
            bottomRow--;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiral(matrix));
    }


}

