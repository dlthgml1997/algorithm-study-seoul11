// https://www.acmicpc.net/problem/10866
import java.io.*;
import java.util.*;

public class Main_BOJ_10866_덱 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int T;
	static Deque<Integer> deque = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		T = stoi(br.readLine());
		for(int i =0 ; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String doing = st.nextToken();
			
			switch(doing) {
				case "push_front" :
					deque.addFirst(stoi(st.nextToken())); 
					break;
				case "push_back" :
					deque.addLast(stoi(st.nextToken())); 
					break;
				case "pop_front" :
					if(deque.isEmpty()) {
						bw.append("-1\n"); break;
					}
					bw.append(deque.pollFirst()+"\n"); break;
				case "pop_back" :
					if(deque.isEmpty()) {
						bw.append("-1\n"); break;
					}
					bw.append(deque.pollLast()+"\n"); break;
				case "size" :
					bw.append(deque.size()+"\n"); break;
				case "empty":
					if(deque.isEmpty()) {
						bw.append(1+"\n"); break;
					} else {
						bw.append(0+"\n"); break;
					}
				case "front" :
					if(deque.isEmpty()) {
						bw.append("-1\n"); break;
					}
					bw.append(deque.peekFirst()+"\n");break;
				case "back" :
					if(deque.isEmpty()) {
						bw.append("-1\n"); break;
					}
					bw.append(deque.peekLast()+"\n"); break;
			}
		}
		bw.flush();
		bw.close();
	}

	private static int stoi(String input) {
		return Integer.parseInt(input);
	}
}
