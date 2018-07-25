package problems_A;

import java.util.Scanner;

public class A1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            int curr = scan.nextInt();
            ar[i] = curr % 2 == 0 ? curr - 1 : curr;
        }
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }
}
