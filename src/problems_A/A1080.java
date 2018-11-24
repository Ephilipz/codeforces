package problems_A;

import java.util.Scanner;

public class A1080 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double friends = in.nextInt();
        double pagesPerNotebook = in.nextInt();
        double redSheetsNeeded = 2 * friends;
        double greenSheetsNeeded = 5 * friends;
        double blueSheetsNeeded = 8 * friends;
        int res = (int) Math.ceil(redSheetsNeeded / pagesPerNotebook);
        res += (int) Math.ceil(greenSheetsNeeded / pagesPerNotebook);
        res += (int) Math.ceil(blueSheetsNeeded / pagesPerNotebook);
        System.out.println(res);
    }
}
