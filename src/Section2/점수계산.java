package section2;

import java.util.*;

public class 점수계산 {
//	public int solution(int n, int[] arr) {
//		int answer=0;
//		int[] temp=new int[n];
//		int cnt=0;
//		for(int i=0; i<n; i++) {
//			if(arr[i]==0) {
//				cnt=0;
//			}else {
//				cnt++;
//			}
//			temp[i]=cnt;
//			answer+=cnt;
//		}
//		return answer;
//	}
	
	public int solution(int n, int[] arr) {
		int answer=0, cnt=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				cnt++;
				answer+=cnt;
			}else {
				cnt=0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 점수계산().solution(n, arr));
		return;
	}
}
