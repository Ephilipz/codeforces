package problems_B;

import java.util.Scanner;

public class B1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = in.next();
        String b = in.next();
        int[] cnts = new int[4];
        for (int i = 0; i < n; i++) {
            String curr = Character.toString(a.charAt(i)) + Character.toString(b.charAt(i));
            if ("00".equals(curr)) cnts[0]++;
            else if ("10".equals(curr)) cnts[1]++;
            else if ("11".equals(curr)) cnts[2]++;
            else cnts[3]++;
        }
        System.out.println(cnts[0] * cnts[1] + cnts[0] * cnts[2] + cnts[3] * cnts[1]);
    }
}
