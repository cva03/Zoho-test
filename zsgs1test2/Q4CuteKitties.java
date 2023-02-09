package zsgs1test2;

import java.util.Arrays;
import java.util.Scanner;

public class Q4CuteKitties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases you want");
        int t=sc.nextInt();
        while(t>0) {
            System.out.println("Enter the number of strings");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the password of each user as a strings");
            String str = sc.nextLine();
            System.out.println("Enter the attempted password");
            String attempt = sc.nextLine();
            Q4CuteKitties solver = new Q4CuteKitties();
            solver.solve(6, str, attempt);
            t--;
        }
    }
/*6
because can do must we what
wedowhatwemustbecausewecan */


    private void solve(int n, String str, String attempt) {
        String result = "";
        String[] strings = new String[n + 1];
        strings[0] = "";
        for (int i = 0; i < n; i++) {
            strings[i] = "";
        }
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                j++;
                continue;
            }
            strings[j] += str.charAt(i);
        }
        String testString = "";
        for (int i = 0; i < attempt.length(); i++) {
            testString += attempt.charAt(i);
            if (check(testString, strings)) {
                result += testString + " ";
                testString = "";
                attempt = attempt.substring(i + 1);
                i = -1;
            }
        }
        if (testString.length() >= 1) {
            System.out.println("WRONG PASSWORD");
        } else {
            System.out.println(result);
        }
    }

    private boolean check(String testString, String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (testString.equals(strings[i])) {
                return true;
            }
        }
        return false;
    }
}
