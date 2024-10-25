package Section5;

import java.util.*;

public class 공주구하기 {
//	public int solution(int n, int k) {
//		int answer=0, idx=k-1;
//		ArrayList<Integer> list=new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			list.add(i+1);
//		}
//		while(list.size()>1) {
//			list.remove(idx);
//			idx+=k-1;
//			idx%=list.size();
//		}
//		answer=list.get(0);
//		return answer;
//	}
	
	public int solution(int n, int k) {
		int answer=0;
		Queue<Integer> Q=new LinkedList<>();
		for(int i=1; i<=n; i++) Q.offer(i);
		while(!Q.isEmpty()) {
			for(int i=1; i<k; i++) Q.offer(Q.poll());
			Q.poll();
			if(Q.size()==1) answer=Q.poll();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.close();
		System.out.println(new 공주구하기().solution(n, k));
		return;
	}
}
