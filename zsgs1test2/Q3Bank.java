package zsgs1test2;

import java.util.Scanner;

public class Q3Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days data you have");
        int days = sc.nextInt();
        System.out.println("Enter the number of trailing days");
        int trail = sc.nextInt();
        int[] data = new int[days];
        for (int i = 0; i < days; i++) {
            data[i] = sc.nextInt();
        }
        Q3Bank bank = new Q3Bank();
        bank.solve(data, days, trail);
    }


    private void solve(int[] data, int days, int trail) {
        if (days <= trail) {
            System.out.println("Cannot send notification");
            return;
        }
        int spend = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < days - 1; i++) {
            sum += data[i];
            if (i + 1 >= trail) {
                double median = (double) sum / trail;
                double doubleValue = data[i + 1];
                if (doubleValue >= 2 * median) {
                    count++;
                }
                sum -= data[(i + 1) - trail];
            }
        }
        System.out.println(count + " notifications");
    }


}
