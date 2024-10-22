package Section3;

import java.util.*;

public class 최대매출 {
//	public int solution(int n, int k, int[] arr) {
//		int answer=0, idx=k, sum=0;
//		for(int i=0; i<k; i++) {
//			sum+=arr[i];
//		}
//		while(true) {
//			answer=Math.max(answer, sum);
//			if(idx==n-1) break;
//			sum=sum+arr[idx]-arr[idx-k];
//			idx++;
//		}
//		return answer;
//	}
	
	public int solution(int n, int k, int[] arr) {
		int answer, sum=0;
		for(int i=0; i<k; i++) sum+=arr[i];
		answer=sum;
		for(int i=k; i<n; i++) {
			sum+=arr[i]-arr[i-k];
			answer=Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 최대매출().solution(n, k, arr));
		return;
	}
}
