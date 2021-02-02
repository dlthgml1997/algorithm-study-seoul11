import java.io.*;
import java.util.*;

public class Main_BOJ_5397_키로거 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = stoi(br.readLine());
		for (int i = 0; i < T; i++) {
			Deque<Character> pw = new ArrayDeque<Character>();
			Deque<Character> wait = new ArrayDeque<Character>();

			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < ch.length; j++) {
				char c = ch[j];
				if (c == '<' || c == '>' || c == '-') {
					switch (c) {
					case '<': {
						if (pw.isEmpty())
							break;
						wait.addFirst(pw.removeLast());
						break;
					}
					case '>': {
						if (wait.isEmpty())
							break;
						pw.addLast(wait.removeFirst());
						break;
					}
					case '-':
						pw.removeLast();
						break;
					}
				} else {
					pw.addLast(c);
				}
			}
			StringBuilder sb = new StringBuilder();
			while (!wait.isEmpty())
				pw.addLast(wait.removeFirst());
			while (!pw.isEmpty())
				sb.append(pw.removeFirst());
			System.out.println(sb);
		}
	}

	private static int stoi(String input) {
		return Integer.parseInt(input);
	}
}
