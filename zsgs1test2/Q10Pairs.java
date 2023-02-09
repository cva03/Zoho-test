package zsgs1test2;

import java.util.Scanner;

public class Q10Pairs {
    public static void main(String[] args) {
        Q10Pairs pairs = new Q10Pairs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n = sc.nextInt();
        System.out.println("Enter all the inputs");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k");
        int k = sc.nextInt();
        pairs.solve(arr, k);
    }

    private void solve(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % k == 0 && i < j) {
                    System.out.printf("[%d,%d]", arr[i], arr[j]);
                }
            }
        }
    }
}
