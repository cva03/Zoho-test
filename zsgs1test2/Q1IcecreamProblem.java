package zsgs1test2;


import java.util.Scanner;

public class Q1IcecreamProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1IcecreamProblem ice = new Q1IcecreamProblem();
        System.out.println("Enter the number of flavours :");
        int[] cost = new int[sc.nextInt()];
        System.out.println("Enter cost of all the flavours :");
        for (int i = 0; i < cost.length; i++) {
            cost[i] = sc.nextInt();
        }
        System.out.println("Enter the amount :");
        int amount = sc.nextInt();
        ice.solve(cost, amount);


    }

    private void solve(int[] cost, int amount) {
        if (cost.length < 2 && cost[0] * 2 != amount) {
            System.out.println("There is only one flavour and the money is not completely spend");
            return;
        }
        boolean atleast = true;
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost.length; j++) {
                if (cost[i] + cost[j] == amount && i < j) {
                    atleast = false;
                    if (i == j) {
                        System.out.printf("Flavour %d for both", i + 1);
                        System.out.println();
                        continue;
                    }
                    System.out.printf("Flavour %d and flavour %d ", i + 1, j + 1);
                    System.out.println();
                }
            }
        }
        if (atleast)
            System.out.println("No combination can be made with given money");
    }
}

