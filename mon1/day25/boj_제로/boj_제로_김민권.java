package mon1.day25.boj_제로;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class boj_제로_김민권 {
    private static int k;
    private static int[] nums;
    private static long result;

    public static void main(String[] args) throws IOException {
        makeInput();
        makeResult();
        printResult();
    }

    private static void makeResult() {
        Stack<Integer> stack = new Stack();
        for(int n : nums) {
            if(n == 0) stack.pop();
            else stack.push(n);
        }
        result = stack.stream().reduce(0, Integer::sum);
    }

    private static void printResult() {
        System.out.println(result);
    }

    private static void makeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        nums = new int[k];
        for(int i = 0; i < k; i++)
            nums[i] = Integer.parseInt(br.readLine());
    }
}
