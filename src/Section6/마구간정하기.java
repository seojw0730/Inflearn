package Section6;

import java.util.*;

public class 마구간정하기 {
	public int count(int[] arr, int dist) {
		int cnt=1, temp=arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-temp>=dist) {
				temp=arr[i];
				cnt++;
			}
		}
		return cnt;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer=0;
		Arrays.sort(arr);
		int lt=arr[0], rt=arr[n-1];
		while(lt<=rt) {
			int mid=(lt+rt)/2;
			if(count(arr, mid)>=c) {
				lt=mid+1;
				answer=mid;
			}else {
				rt=mid-1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 마구간정하기().solution(n, c, arr));
		return;
	}
}
