package section8;

import java.util.*;
import java.io.*;

class Point3{
	int x, y;
	public Point3(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class 섬나라아일랜드_BFS {
	static int n, answer=0;
	static int[] dx= {0, 1, 1, 1, 0, -1, -1, -1};
	static int[] dy= {1, 1, 0, -1, -1, -1, 0, 1};
	Queue<Point3> queue=new LinkedList<>();
	public void BFS(int x, int y, int[][] map) {
		queue.offer(new Point3(x, y));
		while(!queue.isEmpty()) {
			Point3 pos=queue.poll();
			for(int i=0; i<8; i++) {
				int nx=pos.x+dx[i];
				int ny=pos.y+dy[i];
				if(nx>-1 && nx<n && ny>-1 && ny<n && map[nx][ny]==1) {
					map[nx][ny]=0;
					queue.offer(new Point3(nx, ny));
				}
			}
		}
	}
	
	public void solution(int[][] map) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1) {
					answer++;
					map[i][j]=0;
					BFS(i, j, map);
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(br.readLine());
		int[][] map=new int[n][n];
		for(int i=0; i<n; i++) { 
			String[] temp=br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				map[i][j]=Integer.parseInt(temp[j]);
			}
		}
		br.close();
		new 섬나라아일랜드_BFS().solution(map);
		bw.append(String.valueOf(answer)).close();
	}
}
