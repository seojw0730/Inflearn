package Section3;

import java.util.*;

public class 연속부분수열 {
//	public int solution(int n, int m, int[] arr) {
//		int answer=0, sum=0;
//		for(int i=0; i<n; i++) {
//			sum=0;
//			for(int j=i; j<n; j++) {
//				sum+=arr[j];
//				if(sum==m) {
//					answer++;
//					break;
//				}else if(sum>m) break;
//			}
//		}
//		return answer;
//	}
	
	public int solution(int n, int m, int[] arr) {
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++) {
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=arr[lt++];
				if(sum==m) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 연속부분수열().solution(n, m, arr));
		return;
	}
}
