package Section7;

import java.util.*;

public class 경로탐색_ArrayList {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] chk;
	public void DFS(int v) {
		if(v==n-1) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(chk[nv]==0) {
					chk[nv]=1;
					DFS(nv);
					chk[nv]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		chk=new int[n];
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			graph.get(x-1).add(y-1);
		}
		sc.close();
		chk[0]=1;
		new 경로탐색_ArrayList().DFS(0);
		System.out.println(answer);
	}
}