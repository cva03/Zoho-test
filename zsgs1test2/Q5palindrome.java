package zsgs1test2;

import java.util.Scanner;

public class Q5palindrome {
    public static void main(String[] args) {
        Q5palindrome palin = new Q5palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the number of checks");
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            palin.solve("weekk", arr[i][0], arr[i][1]);
        }

    }

    private void solve(String str, int start, int end) {
        String word = "";
        for (int i = start - 1; i < end; i++) {
            word += str.charAt(i);
        }
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
