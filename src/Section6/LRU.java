package section6;

import java.util.*;

public class LRU {
//	public int[] solution(int s, int n, int[] arr) {
//		int[] answer=new int[s];
//		answer[0]=arr[0];
//		for(int i=0; i<n; i++) {
//			int temp=arr[i], j;
//			for(j=0; j<s; j++) {
//				if(answer[j]==temp || answer[j]==0 || j==s-1) break;
//			}
//			for(int k=j; k>0; k--) {
//				answer[k]=answer[k-1];
//			}
//			answer[0]=temp;
//		}
//		return answer;
//	}
	
	public int[] solution(int s, int n, int[] arr) {
		int[] answer=new int[s];
		for(int x : arr) {
			int pos=-1;
			for(int i=0; i<s; i++) if(x==answer[i]) pos=i;
			if(pos==-1) {
				for(int i=s-1; i>=1; i--) {
					answer[i]=answer[i-1];
				}
			}else {
				for(int i=pos; i>=1; i--) {
					answer[i]=answer[i-1];
				}
			}
			answer[0]=x;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i : new LRU().solution(s, n, arr)) {
			System.out.print(i+" ");
		}
	}
}
