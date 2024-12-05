package section10;

import java.util.*;
import java.io.*;

//public class Main {
//	static int[] dy;
//	
//	public int solution(int n, int[] arr) {
//		int[] result = new int[n];
//		for(int i = 0; i < n; i++) {
//			if(i == 0) result[i] = 1;
//			else {
//				int temp = 0;
//				for(int j = 0; j < i; j++) {
//					if(arr[i] > arr[j]) temp = Math.max(temp, result[j]);
//				}
//				result[i] = temp + 1;
//			}
//		}
//		return Arrays.stream(result).max().getAsInt();
//	}
//	
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int n = Integer.parseInt(br.readLine());
//		dy = new int[n];
//		String[] input = br.readLine().split(" ");
//		br.close();
//		int[] arr = new int[n];
//		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
//		bw.append(String.valueOf(new Main().solution(n, arr))).close();
//	}
//}

public class 최대부분증가수열 {
	static int[] dy;
	
	public int solution(int n, int[] arr) {
		int answer = 0;
		dy = new int[n];
		dy[0] = 1;
		for(int i = 1; i < n; i ++) {
			int max = 0;
			for(int j = i - 1; j >= 0; j--) {
				if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
			}
			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		br.close();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
		bw.append(String.valueOf(new 최대부분증가수열().solution(n, arr))).close();
	}
}
