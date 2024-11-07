package section6;

import java.util.*;

public class 뮤직비디오 {
	public int count(int[] arr, int capa) {
		int cnt=1, sum=0;
		for(int i : arr) {
			if(sum+i>capa) {
				cnt++;
				sum=i;
			}else {
				sum+=i;
			}
		}
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer=0;
		int lt=Arrays.stream(arr).max().getAsInt();//배열 중 최대값
		int rt=Arrays.stream(arr).sum();//배열 요소 합
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(count(arr, mid)<=m) {
				answer=mid;
				rt=mid-1;
			}else {
				lt=mid+1;
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
		System.out.println(new 뮤직비디오().solution(n, m, arr));
		return;
	}
}
