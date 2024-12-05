package section10;

import java.util.*;
import java.io.*;

public class 계단오르기 {
	public int solution(int n) {
		int[] chk = new int[n + 1];
		chk[1] = 1;
		chk[2] = 2;
		for(int i = 3; i < n + 1; i++) chk[i] = chk[i - 1] + chk[i - 2];
		return chk[n];
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(new 계단오르기().solution(n))).close();
	}
}
