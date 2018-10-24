package problems_A;

import java.util.Scanner;

public class A1060 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int count8 = 0;
        for (char c : s.toCharArray()) {
            count8 = c == '8' ? count8 + 1 : count8;
        }
        System.out.println((int) Math.min(count8, (Math.floor(n / 11))));
    }
}