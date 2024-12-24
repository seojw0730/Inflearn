package section10;

import java.io.*;

public class 돌다리건너기 {
	public int solution(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 2;
		for(int i = 2; i < n + 1; i++) arr[i] = arr[i - 1] + arr[i - 2];
		return arr[n];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(new 돌다리건너기().solution(n))).close();
	}
}
