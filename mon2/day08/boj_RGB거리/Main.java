package day08.boj_RGB거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        int[][] map = new int[N + 1][N + 1];
        int[][] dp = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 3; j++) {
                map[i][j] = stoi(st.nextToken());
                dp[i][j] = map[i][j];
            }
        }

        for (int i = 2; i <= N; i++) {
            dp[i][1] = Math.min(dp[i - 1][2] + map[i][1], dp[i - 1][3] + map[i][1]);
            dp[i][2] = Math.min(dp[i - 1][1] + map[i][2], dp[i - 1][3] + map[i][2]);
            dp[i][3] = Math.min(dp[i - 1][1] + map[i][3], dp[i - 1][2] + map[i][3]);
        }
        System.out.println(Math.min(dp[N][3], Math.min(dp[N][1], dp[N][2])));
    }

    static int stoi(String input) {
        return Integer.parseInt(input);
    }

}
