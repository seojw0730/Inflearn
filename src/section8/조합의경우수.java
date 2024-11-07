package section8;

import java.util.*;

public class 조합의경우수 {
	int[][] dy=new int[34][34];
	public int solution(int n, int r) {
		if(dy[n][r]!=0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r]=solution(n-1, r-1)+solution(n-1, r);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		System.out.println(new 조합의경우수().solution(n, r));
	}
}
