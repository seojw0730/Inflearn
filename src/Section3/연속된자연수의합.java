package Section3;

import java.util.*;

public class 연속된자연수의합 {
//	public int solution(int n) {
//		int answer=0, sum=0, lt=1;
//		for(int rt=1; rt<=n/2+1; rt++) {
//			sum+=rt;
//			if(sum==n) answer++;
//			while(sum>=n) {
//				sum-=lt;
//				lt++;
//				if(sum==n) answer++;
//			}
//		}
//		return answer;
//	}
	
//	public int solution(int n) {
//		int answer=0, sum=0, lt=0;
//		int m=n/2+1;
//		int[] arr=new int[m];
//		for(int i=0; i<m; i++) arr[i]=i+1;
//		for(int rt=0; rt<m; rt++) {
//			sum+=arr[rt];
//			if(sum==n) answer++;
//			while(sum>=n) {
//				sum-=arr[lt++];
//				if(sum==n) answer++;
//			}
//		}
//		return answer;
//	}
	
	public int solution(int n) {
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n-=cnt;
			if(n%cnt==0) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(new 연속된자연수의합().solution(n));
		return;
	}
}
