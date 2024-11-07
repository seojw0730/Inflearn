package section7;

import java.util.*;

public class 재귀함수 {
	public void DFS(int n) {
		if(n==0) {
			return;
		}else {
			DFS(n-1);
			System.out.print(n+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		new 재귀함수().DFS(n);
		return;
	}
}
