package section6;

import java.util.*;

public class 버블정렬 {
	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		for(int i : new 버블정렬().solution(n, arr)) {
			System.out.print(i+" ");
		}
		return;
	}
}
