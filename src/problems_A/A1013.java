package problems_A;

import java.util.Scanner;

public class A1013 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
//        int b[] = a;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            cnt += (b - a[i]);
        }
        System.out.println(cnt > 0 ? "No" : "Yes");
    }
}
