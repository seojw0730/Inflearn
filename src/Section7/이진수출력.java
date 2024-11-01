package Section7;

import java.util.*;

public class 이진수출력 {
	public void DFS(int n) {
		if(n==0) {
			return;
		}else {
			DFS(n/2);
			System.out.print(String.valueOf(n%2));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		new 이진수출력().DFS(n);
		return;
	}
}
