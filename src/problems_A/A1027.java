package problems_A;

import java.util.Scanner;

public class A1027 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int size = in.nextInt();
            String s = in.next();
            boolean isPalindrome = true;
            //loop over string s
            for (int j = 0; j < size / 2; j++) {
                char start = s.charAt(j);
                char end = s.charAt(size - j - 1);
                if (Math.abs(start - end) > 2 || Math.abs(start - end) == 1) {
                    isPalindrome = false;
                    break;
                }
            }
            sb.append(isPalindrome ? "YES" : "NO");
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
