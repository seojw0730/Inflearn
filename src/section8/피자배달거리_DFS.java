package section8;

import java.util.*;
import java.io.*;

class Point4{
	public int x, y;
	public Point4(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class 피자배달거리_DFS {	
	static int answer=Integer.MAX_VALUE, n, m, len;
	static int[] comb;
	static ArrayList<Point4> pz, hs;
	
	public void DFS(int L, int s) {
		if(L==m) {
			int sum=0;
			for(Point4 hs : hs) {
				int dist=Integer.MAX_VALUE;
				for(int i : comb) dist=Math.min(dist, Math.abs(hs.x-pz.get(i).x)+Math.abs(hs.y-pz.get(i).y));
				sum+=dist;
			}
			answer=Math.min(answer, sum);
		}else {
			for(int i=s; i<len; i++) {
				comb[L]=i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp1=br.readLine().split(" ");
		n=Integer.parseInt(temp1[0]);
		m=Integer.parseInt(temp1[1]);
		pz=new ArrayList<>();
		hs=new ArrayList<>();
		for(int i=0; i<n; i++) {
			String[] temp2=br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				int temp=Integer.parseInt(temp2[j]);
				if(temp==1) hs.add(new Point4(i, j));
				else if(temp==2) pz.add(new Point4(i, j));
			}
		}
		br.close();
		len=pz.size();
		comb=new int[m];
		new 피자배달거리_DFS().DFS(0, 0);
		bw.append(String.valueOf(answer)).close();
	}
}
