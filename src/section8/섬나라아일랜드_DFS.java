package section8;

import java.util.*;
import java.io.*;

//public class Main {
//	static int n;
//	static int[] dx= {0, 1, 1, 1, 0, -1, -1, -1};
//	static int[] dy= {1, 1, 0, -1, -1, -1, 0, 1};
//	static int[][] map;
//	
//	public void solution(int x, int y) {
//		for(int i=0; i<8; i++) {
//			int nx=x+dx[i];
//			int ny=y+dy[i];
//			if(nx>-1 && nx<n && ny>-1 && ny<n && map[nx][ny]==1) {
//				map[nx][ny]=0;
//				solution(nx, ny);
//			}
//		}
//	}
//	
//	public static void main(String[] args) throws Exception {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		n=Integer.parseInt(br.readLine());
//		map=new int[n][n];
//		for(int i=0; i<n; i++) { 
//			String[] temp=br.readLine().split(" ");
//			for(int j=0; j<n; j++) {
//				map[i][j]=Integer.parseInt(temp[j]);
//			}
//		}
//		br.close();
//		Main T=new Main();
//		int answer=0;
//		map[0][0]=0;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				if(map[i][j]==1) {
//					answer++;
//					T.solution(i, j);
//				}
//			}
//		}
//		bw.append(String.valueOf(answer)).close();
//	}
//}

public class 섬나라아일랜드_DFS {
	static int n, answer=0;
	static int[] dx= {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] dy= {1, 1, 0, -1, -1, -1, 0, 1};
	static int[][] map;
	
	public void DFS(int x, int y, int[][] map) {
		for(int i=0; i<8; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(nx>-1 && nx<n && ny>-1 && ny<n && map[nx][ny]==1) {
				map[nx][ny]=0;
				DFS(nx, ny, map);
			}
		}
	}
	
	public void solution(int[][] map) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1) {
					answer++;
					map[i][j]=0;
					DFS(i, j, map);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(br.readLine());
		map=new int[n][n];
		for(int i=0; i<n; i++) { 
			String[] temp=br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				map[i][j]=Integer.parseInt(temp[j]);
			}
		}
		br.close();
		new 섬나라아일랜드_DFS().solution(map);
		bw.append(String.valueOf(answer)).close();
	}
}
