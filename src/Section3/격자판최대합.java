package Section3;

import java.util.*;

public class 격자판최대합 {
//	public int solution(int n, int[][] arr) {
//		int answer=Integer.MIN_VALUE;
//		int[] temp=new int[n*n+2];
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				temp[i]+=arr[i][j];
//				temp[i+n]+=arr[j][i];
//			}
//			temp[temp.length-2]+=arr[i][i];
//			temp[temp.length-1]+=arr[n-1-i][i];
//		}
//		for(int i=0; i<temp.length; i++) {
//			if(temp[i]>answer) {
//				answer=temp[i];
//			}
//		}
//		return answer;
//	}
	
	public int solution(int n, int[][] arr) {
		int answer=Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				 sum1+=arr[i][j];
				 sum2+=arr[j][i];
			}
			answer=Math.max(sum1, answer);
			answer=Math.max(sum2, answer);
		}
		sum1=sum2=0;
		for(int i=0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-1-i];
		}
		answer=Math.max(sum1, answer);
		answer=Math.max(sum2, answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println(new 격자판최대합().solution(n, arr));
		return;
	}
}
