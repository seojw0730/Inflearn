package section2;

import java.util.*;

public class 소수_에라토스테네스체 {
//	public int solution(int n) {
//		int answer=0;
//		for(int i=2; i<=n; i++) {
//			int cnt=0;
//			for(int j=1; j<Math.sqrt(i); j++) {
//				if(i%j==0) {
//					cnt++;
//				}
//			}
//			if(cnt==1) {
//				answer++;
//			}
//		}
//		return answer;
//	}
	
	// 배수인건 다 1로 변경
	public int solution(int n) {
		int answer=0;
		int[] ch=new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j+=i) {
					ch[j]=1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(new 소수_에라토스테네스체().solution(n));
		return;
	}
}
