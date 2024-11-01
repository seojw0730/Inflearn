package Section7;

import java.util.*;

public class 팩토리얼 {
	public int DFS(int n) {
		if(n==1) {
			return 1;
		}else {
			return DFS(n-1) * n;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(new 팩토리얼().DFS(n));
		return;
	}
}
