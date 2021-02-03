package mon1.day26.boj_옥상정원꾸미기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_옥상정원꾸미기_김민권 {
    private static int n;
    private static long[] bHeight;
    private static long result;

    public static void main(String[] args) throws IOException {
        makeInput();
        findBenchMarkingNumber();
        System.out.println(result);
    }

    private static void findBenchMarkingNumber() {
        Stack<Long> st = new Stack<>();

        // st에는 i-th 빌딩을 볼 수 있는 건물만 남긴다!
        for(int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= bHeight[i]) st.pop();
            st.push(bHeight[i]);
            result += (st.size() - 1);
        }
    }

    private static void makeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bHeight = new long[n];
        for(int i = 0; i < n; i++) bHeight[i] = Long.parseLong(br.readLine());
    }
}
