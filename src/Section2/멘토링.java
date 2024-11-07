package section2;

import java.util.*;

public class 멘토링 {
//	public int solution(int n, int m, int[][] arr) {
//		int answer=0, a=1, b=2;
//		boolean prev=true, now=true;
//		while(true) {
//			for(int i=0; i<m; i++) {
//				int aIdx=0, bIdx=0;
//				for(int j=0; j<n; j++) {
//					if(arr[i][j]==a) aIdx=j;
//					if(arr[i][j]==b) bIdx=j;
//					if(aIdx<bIdx) now=true;
//					else if(aIdx>bIdx) now=false;
//				}
//				if(i>0 && now!=prev) break;
//				prev=now;
//				if(i==m-1) answer++;
//			}
//			
//			b++;
//			if(b>n) {
//				a++;
//				if(a>n-1) {
//					break;
//				}
//				b=a+1;
//			}
//		}
//		return answer;
//	}
	
	public int solution(int n, int m, int[][] arr) {
		int answer=0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int cnt=0;
				for(int k=0; k<m; k++) {
					int pi=0, pj=0;
					for(int s=0; s<n; s++) {
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
				if(cnt==m) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println(new 멘토링().solution(n, m, arr));
		return;
	}
}
