package section8;

import java.util.*;

public class 바둑이승차 {
	static int c, n, answer=Integer.MIN_VALUE;
	static int[] arr;
	public void solution(int L, int sum) {
		if(sum>c) return;
		if(L==n) {
			answer=Math.max(answer, sum);
		}else {
			solution(L+1, sum+arr[L]);
			solution(L+1, sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		new 바둑이승차().solution(0, 0);
		System.out.println(answer);
	}
}
