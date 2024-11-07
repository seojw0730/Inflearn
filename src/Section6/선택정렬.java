package section6;

import java.util.*;

public class 선택정렬 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			int idx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[idx]) idx=j;
			}
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i : new 선택정렬().solution(n, arr)) {
			System.out.print(i+" ");
		}
		return;
	}
}
