package zsgs1test2;

import java.util.Arrays;
import java.util.Scanner;

public class Q9Pattern {
    public static void main(String[] args) {
        Q9Pattern pat = new Q9Pattern();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print");
        int n=sc.nextInt();
        pat.print(n);
    }

    private void print(int n) {
        int[][] arr = new int[n][n];
        int l = n;
        int a = 0;
        int b = l - 1;
        while (true) {
            for (int i = a; i <= b; i++) {
                arr[a][i] = 1;
                arr[i][a] = 1;
                arr[i][b] = 1;
                arr[b][i] = 1;
            }
            a = a + 2;
            b = b - 2;
            if (a >= b) {
                break;
            }
        }
        arr[a][b] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
