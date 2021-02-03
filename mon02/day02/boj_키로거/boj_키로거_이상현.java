package mon02.day02.boj_키로거;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/*
 * 좌우로 덱을 나눠서 계산하자!
 */

public class boj_키로거_이상현 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int tc = 0;
		
		while(tc++ < T) {
			Deque<Character> q = new ArrayDeque<>();
			Deque<Character> temp = new ArrayDeque<>();
			char[] arr = br.readLine().toCharArray();
			int len = arr.length;
			int idx = 0;
			
			for(int i = 0; i < len; i++) {
				int size = q.size();
				
				if(arr[i] == '<')  // 왼쪽으로 이동
					idx = idx == 0 ? idx : idx-1; 
				
				else if(arr[i] == '>') // 오른쪽으로 이동
					idx = idx < q.size() ? idx+1 : idx;	
				
				else if(arr[i] == '-') {
					if(idx >= size/2) { // 오른쪽을 빼기 (len-idx 만큼)
						for(int j = idx+1; j < size; j++) 
							temp.addLast(q.pollLast());
						q.pollLast();
						for(int j = idx+1; j < size; j++) 
							q.addLast(temp.pollFirst());
					}
					else { // 왼쪽으로 빼기 (idx만큼)
						for(int j = 0; j < idx; j++) 
							temp.addLast(q.pollFirst());
						q.pollFirst();
						for(int j = 0; j < idx; j++) 
							q.addFirst(temp.pollLast());
					}
					idx = idx == 0 ? idx : idx-1; 
				}
				else {// 알파벳
					if(idx > size/2) { // 오른쪽을 빼기 (len-idx 만큼)
						for(int j = idx+1; j < size; j++) 
							temp.addLast(q.pollLast());
						q.addLast(arr[i]);
						for(int j = idx+1; j < size; j++) 
							q.addLast(temp.pollFirst());
					}
					else { // 왼쪽으로 빼기 (idx만큼)
						for(int j = 0; j < idx; j++) 
							temp.addLast(q.pollFirst());
						q.addFirst(arr[i]);
						for(int j = 0; j < idx; j++) 
							q.addFirst(temp.pollLast());
					}
					idx = idx < q.size() ? idx+1 : idx;				
				}
			}
					
			for(Character c : q) 
				sb.append(c);
			sb.append("\n");
		}	
		System.out.print(sb);
	}
}
