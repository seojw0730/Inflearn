package section8;

import java.util.*;

public class 합이같은부분집합 {
	static String answer="NO";
	static int n, total=0;
	boolean flag=false;
	
	public void solution(int L, int sum, int[] arr) {
		if(flag) return;
		if(sum>total/2) return;
		if(L==n) {
			if((total-sum)==sum) {
				answer="YES";
				flag=true;
			}
		}else {
			solution(L+1, sum+arr[L], arr);
			solution(L+1, sum, arr);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			total+=arr[i];
		}
		sc.close();
		new 합이같은부분집합().solution(0, 0, arr);
		System.out.println(answer);
	}
}
