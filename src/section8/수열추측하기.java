package section8;

import java.util.*;

public class 수열추측하기 {
	
	static int[] b, p, chk;
	static int n, f;
	boolean flag=false;
	int[][] dy=new int[35][35];
	public int combination(int n, int r) {
		if(dy[n][r]!=0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r]=combination(n-1, r-1)+combination(n-1, r);
	}
	
	public void solution(int L, int sum) {
		if(flag) return;
		if(L==n) {
			if(sum==f) {
				for(int i : p) System.out.print(i+" ");
				flag=true;
			}
		}else {
			for(int i=1; i<=n; i++) {
				if(chk[i]==0) {
					chk[i]=1;
					p[L]=i;
					solution(L+1, sum+p[L]*b[L]);
					chk[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		수열추측하기 T=new 수열추측하기();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		f=sc.nextInt();
		sc.close();
		b=new int[n];
		p=new int[n];
		chk=new int[n+1];
		for(int i=0; i<n; i++) b[i]=T.combination(n-1, i);
		T.solution(0, 0);
	}
}
