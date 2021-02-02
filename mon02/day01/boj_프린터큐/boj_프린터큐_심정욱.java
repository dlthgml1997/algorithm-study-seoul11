package mon02.day01.boj_프린터큐;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_프린터큐_심정욱 {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(bufferedReader.readLine());
        for(int i = 0 ; i < T; i++) {
            solve();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }

    private static void solve() throws IOException {
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[] importantType = new int[10];
        int[] importants = new int[N];
        StringTokenizer importantString = new StringTokenizer(bufferedReader.readLine());
        Queue<int[]> queue = new LinkedList<>();
        int maxImportant = 0;
        for(int i = 0; i < N; i++) {
            importants[i] = Integer.parseInt(importantString.nextToken());
            importantType[importants[i]]++;
            if(maxImportant < importants[i]) {
                maxImportant = importants[i];
            }
            queue.add(new int[] {i, importants[i]});
        }
        while(true) {
            int idx = queue.peek()[0];
            int important = queue.peek()[1];

            queue.remove();
            if(important != maxImportant) {
                queue.add(new int[] {idx, important});
            }
            else {
                if(idx == M) {
                    bufferedWriter.write( N - queue.size() + "\n");
                    return;
                }
                importantType[important]--;
                if(importantType[important] == 0) {
                    for(int i = important; i >= 1; i--) {
                        if(importantType[i] > 0) {
                            maxImportant = i;
                            break;
                        }
                    }
                }
            }
        }
    }
}
