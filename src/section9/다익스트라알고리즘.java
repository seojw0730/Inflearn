package section9;

import java.util.*;
import java.io.*;

class Edge implements Comparable<Edge> {
	public int vex, cost; // 정점, 비용(가중치)
	public Edge(int vex, int cost) {
		this.vex=vex;
		this.cost=cost;
	}
	
	@Override
	public int compareTo(Edge o) {
		return this.cost-o.cost;
	}
}

public class 다익스트라알고리즘 {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dist;
	
	public void solution(int v) {
		PriorityQueue<Edge> queue=new PriorityQueue<>();
		queue.offer(new Edge(v, 0));
		dist[v]=0;
		while(!queue.isEmpty()) {
			Edge temp=queue.poll();
			int now=temp.vex;
			int nowCost=temp.cost;
			if(nowCost>dist[now]) continue;
			for(Edge edge : graph.get(now)) {
				if(dist[edge.vex]>nowCost+edge.cost) {
					dist[edge.vex]=nowCost+edge.cost;
					queue.offer(new Edge(edge.vex, nowCost+edge.cost));
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp1=br.readLine().split(" ");
		n=Integer.parseInt(temp1[0]);
		m=Integer.parseInt(temp1[1]);
		graph=new ArrayList<>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<>());
		}
		dist=new int[n+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		for(int i=0; i<m; i++) {
			String[] temp2=br.readLine().split(" ");
			int a=Integer.parseInt(temp2[0]);
			int b=Integer.parseInt(temp2[1]);
			int c=Integer.parseInt(temp2[2]);
			graph.get(a).add(new Edge(b, c));
		}
		br.close();
		new 다익스트라알고리즘().solution(1);
		for(int i=2; i<=n; i++) {
			if(dist[i]!=Integer.MAX_VALUE) bw.append(i+": "+dist[i]);
			else bw.append(i+": impossible");
		}
		bw.close();
	}
}
