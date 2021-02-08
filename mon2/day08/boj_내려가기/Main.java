package day08.boj_내려가기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = stoi(br.readLine());
        int[] map = new int[3];
        int[] min = new int[3];
        int[] max = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        map[0] = stoi(st.nextToken());
        map[1] = stoi(st.nextToken());
        map[2] = stoi(st.nextToken());
        min[0] = max[0] = map[0];
        min[1] = max[1] = map[1];
        min[2] = max[2] = map[2];
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = stoi(st.nextToken());
            int b = stoi(st.nextToken());
            int c = stoi(st.nextToken());
            int tmpA = Math.min(min[0] + a, min[1] + a);
            int tmpB = Math.min(Math.min(min[1] + b, min[0] + b), min[2] + b);
            int tmpC = Math.min(min[1] + c, min[2] + c);
            min[0] = tmpA;
            min[1] = tmpB;
            min[2] = tmpC;

            tmpA = Math.max(max[0] + a, max[1] + a);
            tmpB = Math.max(Math.max(max[1] + b, max[2] + b), max[0] + b);
            tmpC = Math.max(max[2] + c, max[1] + c);
            max[0] = tmpA;
            max[1] = tmpB;
            max[2] = tmpC;
        }
        System.out.print(Math.max(Math.max(max[0], max[1]), max[2]) + " ");
        System.out.println(Math.min(Math.min(min[0], min[1]), min[2]));

    }

    static int stoi(String input) {
        return Integer.parseInt(input);
    }

}
