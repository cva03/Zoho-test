package zsgs1test2;

import java.util.Arrays;
import java.util.Scanner;

public class Q6RotateMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns you want to use");
        int n = sc.nextInt();
        System.out.println("enter all the inputs");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        Q6RotateMatrix rotate = new Q6RotateMatrix();
        for (int i = 0; i < 3; i++) {
            rotate.leftRotate(matrix);
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void leftRotate(int[][] matrix) {
        transpose(matrix);
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}
