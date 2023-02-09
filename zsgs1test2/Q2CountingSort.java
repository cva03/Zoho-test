package zsgs1test2;

import java.util.Scanner;

public class Q2CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        System.out.println("Enter all the strings");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        Q2CountingSort sort = new Q2CountingSort();
        sort.solve(str);
    }

    private void sortAndPrint(String[][] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (Integer.parseInt(strings[i][0]) < Integer.parseInt(strings[j][0])) {
                    String[] temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        print(strings);
    }

    private void print(String[][] strings) {
        for (String str[] : strings) {
            System.out.print(str[1]);
            if (str[1] != "-") {
                System.out.print(" ");
            }
        }
    }

    private void solve(String[] str) {
        String[][] strings = new String[str.length][str.length];
        for (int i = 0; i < str.length; i++) {
            char[] temp = str[i].toCharArray();
            if (str[i].length() < 3) {
                strings[i][0] = temp[0] + "";
                strings[i][1] = "";
                continue;
            }
            int num = 0;
            for (int j = 0; j < temp.length - 1; j++) {
                num = num + temp[j] - '0';
                if (temp[j + 1] == ' ') {
                    strings[i][0] = String.valueOf(num);
                    if (i < str.length / 2) {
                        strings[i][1] = "-";
                    } else {
                        strings[i][1] = str[i].substring(j + 2);
                    }
                }
            }
            System.out.println(strings[i][0] + strings[i][1]);
        }
        sortAndPrint(strings);
    }
}
/*
0 ab
6 cd
0 ef
6 gh
4 ij
0 ab
6 cd
0 ef
6 gh
0 ij
4 that
3 be
0 to
1 be
5 question
1 or
2 not
4 is
2 to
4 the
*/

