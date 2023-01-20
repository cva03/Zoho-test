package ZSGS1_test1;

import java.util.Scanner;

public class Q5_CountOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String ref=sc.nextLine();
        for(int i=0;i<ref.length();i++){
            int count=0;
            for(int j=0;j<input.length();j++){
                if(ref.toLowerCase().charAt(i)==input.toLowerCase().charAt(j)){
                    count++;
                }
            }
            System.out.println(ref.charAt(i)+":"+count);
        }
    }
//    int n=sc.nextInt();
//    int m=sc.nextInt();
//    String[] x=new String[n];
//    String[] y=new String[m];
//        for(int i=0;i<n;i++){
//        x[i]=sc.nextLine();
//    }
//        for(int i=0;i<n;i++){
//        y[i]=sc.nextLine();
//    }
}
