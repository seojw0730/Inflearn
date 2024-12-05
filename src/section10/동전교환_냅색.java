package section10;

import java.util.*;
import java.io.*;

public class 동전교환_냅색 {
	public int solution(int n, int[] coins, int money) {
		Arrays.sort(coins);
		int[] dy = new int[money + 1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int coin : coins) {
			for(int j = coin; j <= money; j++) {
				dy[j] = Math.min(dy[j], dy[j - coin] + 1);
			}
			for(int i : dy) System.out.print(i + " ");
			System.out.println();
		}
		return dy[money];
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] coins = new int[n];
		String[] input = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(input[i]);
		}
		int money = Integer.parseInt(br.readLine());
		br.close();
		bw.append(String.valueOf(new 동전교환_냅색().solution(n, coins, money))).close();
	}
}