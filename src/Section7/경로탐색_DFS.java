package Section7;

import java.util.*;

public class 경로탐색_DFS {
	static int n, answer=0;
	static int[][] graph;
	static int[] chk;
	
	public void DFS(int v) {
		if(v==n-1) answer++;
		else {
			for(int i=0; i<n; i++) {
				if(graph[v][i]==1 && chk[i]==0) {
					chk[i]=1; // 체크
					DFS(i); // 이걸로 탐색하고
					chk[i]=0; // 여기서 체크 해제
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int m=sc.nextInt();
		graph=new int[n][n];
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			graph[x-1][y-1]=1;
		}
		chk=new int[n];
		sc.close();
		chk[0]=1;
		new 경로탐색_DFS().DFS(0);
		System.out.println(answer);
	}
}