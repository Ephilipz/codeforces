package problems_A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = 0; j < 4; j++) {
                currSum += in.nextInt();
            }
            sums.add(currSum);
        }
        List<Integer> sortedSums = new ArrayList<>();
        for (int i : sums) {
            sortedSums.add(i);
        }
        Collections.sort(sortedSums);
        Collections.reverse(sortedSums);
        int thomasSmithGrade = sums.get(0);
        int res = sortedSums.indexOf(thomasSmithGrade) + 1;
        System.out.println(res);
    }
}
