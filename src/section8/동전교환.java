package section8;

import java.util.*;

public class 동전교환 {
//	public int solution(int n, Integer[] money, int price, int sum) {
//		Queue<Integer> queue=new LinkedList<>();
//		queue.offer(sum);
//		boolean exit=false;
//		int L=0;
//		while(!exit) {
//			int len=queue.size();
//			for(int i=0; i<len; i++) {
//				int curr=queue.poll();
//				for(int j=0; j<n; j++) {
//					if(curr+money[j]<=price) {
//						if(curr+money[j]==price) {
//							return L+1;
//						}
//						queue.offer(curr+money[j]);
//					}
//				}
//			}
//			L++;
//		}
//		return L;
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		Integer[] money=new Integer[n];
//		for(int i=0; i<n; i++) {
//			money[i]=sc.nextInt();
//		}
//		Arrays.sort(money, Collections.reverseOrder());
//		int price=sc.nextInt();
//		sc.close();
//		System.out.println(new Main().solution(n, money, price, 0));
//	}
	
	static int n, m, answer=Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum>m) return;
		if(L>=answer) return;
		if(sum==m) {
			answer=Math.min(answer, L);
		}else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+arr[i], arr);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		m=sc.nextInt();
		sc.close();
		new 동전교환().DFS(0, 0, arr);
		System.out.println(answer);
	}
}