package problems_A;

import java.util.Scanner;

public class A1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a[] = new long[4];
        for (int i = 0; i < 4; i++) {
            a[i] = in.nextLong();
        }
        long n = a[0];
        long m = a[1];
        long k = a[2];
        long l = a[3];

        long giftPerPerson = ((l + k) + m - 1) / m;
        if (giftPerPerson * m > n)
            System.out.println(-1);
        else
            System.out.println(giftPerPerson);
    }
}
