package zsgs1test2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7Subset {
    public static void main(String[] args) {
        System.out.println("Enter the number of inputs");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter all the inputs");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Q7Subset subset = new Q7Subset();
        subset.solve(arr);
    }

    private void solve(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        int j = 0;
        System.out.println(new ArrayList<>());
        while (j < 3) {
            for (int i = j, k = 0; i < arr.length; i++, k++) {
                list.add(new ArrayList<>());
                list.get(k).add(arr[i]);
                System.out.println(list.get(k));
            }
            j++;
        }
    }
}
