package section8;

import java.util.*;

public class 조합구하기 {
	static int n, m;
	static int[] comb;
	
	public void solution(int L, int s) {
		if(L==m) {
			for(int i : comb) {
				System.out.print(i+" ");
			}
			System.out.println();
		}else {
			for(int i=s; i<=n; i++) {
				comb[L]=i;
				solution(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sc.close();
		comb=new int[m];
		new 조합구하기().solution(0, 1);
	}
}
