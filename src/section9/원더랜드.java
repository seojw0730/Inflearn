package section9;

import java.util.*;
import java.io.*;

//class Edge2 implements Comparable<Edge2> {
//	public int v1, v2, cost;
//
//	public Edge2(int v1, int v2, int cost) {
//		this.v1 = v1;
//		this.v2 = v2;
//		this.cost = cost;
//	}
//
//	@Override
//	public int compareTo(Edge2 o) {
//		return this.cost - o.cost;
//	}
//}
//
//public class Main {
//	static int[] unf;
//	
//	public static int Find(int v) {
//		if(v == unf[v]) return v;
//		else return unf[v] = Find(unf[v]);
//	}
//	
//	public static void Union(int a, int b) {
//		int fa = Find(a);
//		int fb = Find(b);
//		if(fa != fb) unf[fa] = fb;
//	}
//
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] input1 = br.readLine().split(" ");
//		int v = Integer.parseInt(input1[0]);
//		int e = Integer.parseInt(input1[1]);
//		unf = new int[v];
//		List<Edge2> list = new ArrayList<>();
//		for(int i = 0; i < v; i++) {
//			unf[i] = i;
//		}
//		for(int i = 0; i < e; i++) {
//			String[] input2 = br.readLine().split(" ");
//			int a = Integer.parseInt(input2[0]);
//			int b = Integer.parseInt(input2[1]);
//			int c = Integer.parseInt(input2[2]);
//			list.add(new Edge2(a - 1, b - 1, c));
//		}
//		br.close();
//		int answer = 0;
//		Collections.sort(list);
//		for(Edge2 edge : list) {
//			int fv1 = Find(edge.v1);
//			int fv2 = Find(edge.v2);
//			if(fv1 != fv2) {
//				answer += edge.cost;
//				Union(edge.v1, edge.v2);
//			}
//		}
//		bw.append(String.valueOf(answer)).close();
//	}
//}

class Edge2 implements Comparable<Edge2> {
	int vex, cost;
	public Edge2(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Edge2 o) {
		return this.cost - o.cost;
	}
}

public class 원더랜드 {
	static int[] chk;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] input1 = br.readLine().split(" ");
		int v = Integer.parseInt(input1[0]);
		int e = Integer.parseInt(input1[1]);
		List<List<Edge2>> graph = new ArrayList<>();
		for(int i = 0; i < v + 1; i++) graph.add(new ArrayList<Edge2>());
		for(int i = 0; i < e; i++) {
			String[] temp = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			int c = Integer.parseInt(temp[2]);
			graph.get(a).add(new Edge2(b, c));
			graph.get(b).add(new Edge2(a, c));
		}
		br.close();
		chk = new int[v + 1];
		int answer = 0;
		PriorityQueue<Edge2> queue = new PriorityQueue<>();
		queue.offer(new Edge2(1, 0));
		while(!queue.isEmpty()) {
			Edge2 temp = queue.poll();
			int ev = temp.vex;
			if(chk[ev] == 0) {
				chk[ev] = 1;
				answer += temp.cost;
				for(Edge2 edge : graph.get(ev)) {
					if(chk[edge.vex] == 0) queue.offer(new Edge2(edge.vex, edge.cost));
				}
			}
		}
		bw.append(String.valueOf(answer)).close();
	}
}