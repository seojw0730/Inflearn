package section8;

import java.util.*;

public class 순열구하기 {
	static int n, m;
	static int[] answer, chk, arr;
	
	public void solution(int L) {
		if(L==m) {
			for(int i : answer) {
				System.out.print(i+" ");
			}
			System.out.println();
		}else {
			for(int i=0; i<n; i++) {
				if(chk[i]==0) {
					chk[i]=1;
					answer[L]=arr[i];
					solution(L+1);
					chk[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		sc.close();
		chk=new int[n];
		answer=new int[m];
		new 순열구하기().solution(0);
	}
}
