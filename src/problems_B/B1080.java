package problems_B;

import java.util.Scanner;

public class B1080 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            if (r % 2 != 0 && l % 2 == 0)
                res[i] = (r - l + 1) / -2;
            else if (r % 2 == 0 && l % 2 != 0)
                res[i] = (r - l + 1) / 2;
            else if (l % 2 == 0 && r % 2 == 0)
                res[i] = (l + r) / 2;
            else if (r % 2 != 0 && l % 2 != 0)
                res[i] = (l + r) / -2;
            else if (l - r == 0)
                res[i] = l % 2 == 0 ? l : -1 * l;
        }
        for (int i :
                res) {
            System.out.println(i);
        }
    }

//    private static int computeAnswer(int l, int r) {
//        int res = 0;
//        for (int i = l; i <= r; i++) {
//            res += i % 2 == 0 ? i : i * -1;
//        }
//        return res;
//    }
}
