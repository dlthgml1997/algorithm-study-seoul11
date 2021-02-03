package mon1.day28.boj_문자열;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.Scanner;

public class boj_문자열_김민권 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(MinimumDiffBetweenAB(sc.next(), sc.next()));
        sc.close();
    }

    private static int MinimumDiffBetweenAB(String A, String B) {
        int minimumDiff = Integer.MAX_VALUE;
        for(int i = 0; i <= B.length() - A.length(); i++) {
            int currDiffCnt = 0;
            for(int j = 0; j < A.length(); j++) if(B.charAt(i + j) != A.charAt(j)) currDiffCnt++;
            minimumDiff = Math.min(minimumDiff, currDiffCnt);
        }
        return minimumDiff;
    }
}
