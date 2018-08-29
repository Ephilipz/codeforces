package problems_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<String> list = new ArrayList<>();
        int indexOfFirstB = -1;
        int indexOfFirstBRow = -1;
        for (int i = 0; i < n; i++) {
            String s = in.next();
            list.add(s);
            if (indexOfFirstB == -1) {
                indexOfFirstB = s.indexOf('B');
                indexOfFirstBRow = i;
            }
        }
        int cntB = 0;
        for (int i = 0; i < n; i++) cntB = list.get(i).contains("B") ? cntB + 1 : cntB;

        int[] center = new int[2];
        center[0] = (indexOfFirstB + (cntB - 1) / 2) + 1;
        center[1] = indexOfFirstBRow + (cntB - 1) / 2 + 1;
        System.out.println(center[1] + " " + center[0]);

    }
}
