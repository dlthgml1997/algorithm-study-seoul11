package day08.boj_1로만들기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1) {
            System.out.println(0);
        } else if (N == 2) {
            System.out.println(1);
        } else {
            int[] dp = new int[N + 1];
            Arrays.fill(dp, N);
            dp[2] = dp[3] = 1;
            for (int i = 4; i <= N; i++) {
                int min = dp[i - 1] + 1;
                if (i % 2 == 0) {
                    min = Math.min(min, dp[i / 2] + 1);
                }
                if (i % 3 == 0) {
                    min = Math.min(min, dp[i / 3] + 1);
                }
                dp[i] = min;
            }
            System.out.println(dp[N]);
        }
    }
}
