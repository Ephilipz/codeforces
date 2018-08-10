package problems_B;

import java.util.Scanner;

public class B1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = in.next();
        String b = in.next();
        int count0b = b.length() - b.replace("0", "").length();
        int count0a = a.length() - a.replace("0", "").length();
        int count1a = a.length() - a.replace("1", "").length();
        boolean has1andZero = a.contains("0") && a.contains("1");
        System.out.println(has1andZero ? count0b * Math.min(count0a, count1a) : 0);
    }
}
