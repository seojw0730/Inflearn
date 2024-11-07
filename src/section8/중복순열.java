package section8;

import java.util.*;

public class 중복순열 {
	static int n, m;
	static int[] arr;
	
	public void solution(int L) {
		if(L==m) {
			for(int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}else {
			for(int i=0; i<n; i++) {
				arr[L]=i+1;
				solution(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sc.close();
		arr=new int[m];
		new 중복순열().solution(0);
	}
}
