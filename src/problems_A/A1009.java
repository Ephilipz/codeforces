package problems_A;

import java.util.Scanner;

public class A1009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = in.nextInt();
        }
        int[] ar2 = new int[m];
        for (int i = 0; i < m; i++) {
            ar2[i] = in.nextInt();
        }

        for (int i = 0, j = 0; i < n && j < m; i++) {
            if (ar2[j] >= ar1[i]) {

            }
        }
    }
}
