package problems_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(in.nextInt());
        }
        int res = 2;
        for (int i = 0; i < n - 1; i++) {
            int diff = al.get(i + 1) - al.get(i);
            if (diff > 2 * d)
                res += 2;
            else if (res == 2 * d)
                res += 1;
        }
        System.out.println(res);
    }
}
