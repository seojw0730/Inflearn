package section10;

import java.io.*;

public class 최대점수구하기_냅색 {
	public static int solution(int n, int m, int[][] arr) {
		int answer = 0;
		int[] dy = new int[m + 1];
		for(int i = 0; i < n; i++) {
			int score = arr[i][0], time = arr[i][1];
			for(int j = m; j >= time; j--) {
				dy[j] = Math.max(dy[j], dy[j - time] + score);
				answer = Math.max(answer, dy[j]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			String[] input2 = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				arr[i][j] = Integer.parseInt(input2[j]);
			}
		}
		br.close();
		bw.append(String.valueOf(solution(n, m, arr))).close();
	}
}
