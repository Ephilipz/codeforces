package problems_A;

import java.util.Scanner;

public class A1073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String res = "";
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                System.out.println("YES\n" + s.charAt(i) + s.charAt(i + 1));
                return;
            }
        }
        System.out.println("NO");
    }
}
