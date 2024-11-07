package section7;

import java.util.*;

public class 그래프최단거리_BFS {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] chk, dist;
	public void BFS(int v) {
		Queue<Integer> queue=new LinkedList<>();
		chk[v]=1;
		dist[v]=0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cv=queue.poll();
			for(int nv : graph.get(cv)) {
				if(chk[nv]==0) {
					chk[nv]=1;
					queue.offer(nv);
					dist[nv]=dist[cv]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		graph=new ArrayList<>();
		for(int i=0; i<n; i++) {
			graph.add(new ArrayList<>());
		}
		chk=new int[n];
		dist=new int[n];
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			graph.get(x-1).add(y-1);
		}
		sc.close();
		new 그래프최단거리_BFS().BFS(0);
		for(int i=1; i<n; i++) {
			System.out.println(i+1+": "+dist[i]);
		}
	}
}
