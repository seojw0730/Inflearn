package section8;

import java.util.*;

public class 최대점수구하기 {
	static int n, m, answer=Integer.MIN_VALUE;
	static int[] a, b;
	boolean flag=false;
	
	public void solution(int L, int score, int time) {
		if(time>m) return;
		if(L==n) {
			answer=Math.max(answer, score);
		}else {
			solution(L+1, score+a[L], time+b[L]);
			solution(L+1, score, time);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n];
		b=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		sc.close();
		new 최대점수구하기().solution(0, 0, 0);
		System.out.println(answer);
	}
}
