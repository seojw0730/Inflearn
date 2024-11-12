package section8;

import java.util.*;
import java.io.*;

class Tomato{
	int x, y;
	public Tomato(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class 토마토_BFS {
	static int n, m;
	static int[] dx= {1, 0, -1, 0};
	static int[] dy= {0, 1, 0, -1};
	
	public int solution(int[][] box, ArrayList<Tomato> day, int max) {
		int answer=0, num=0;
		Queue<Tomato> queue=new LinkedList<>();
		for(Tomato t : day) {
			queue.offer(t);
			num++;
		}
		while(!queue.isEmpty()) {
			if(num==max) return answer;
			int len=queue.size();
			for(int i=0; i<len; i++) {
				Tomato temp=queue.poll();
				for(int j=0; j<4; j++) {
					int nx=temp.x+dx[j];
					int ny=temp.y+dy[j];
					if(nx>-1 && nx<n && ny>-1 && ny<m && box[nx][ny]==0) {
						box[nx][ny]=1;
						queue.offer(new Tomato(nx, ny));
						num++;
					}
				}
			}
			answer++;
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp1=br.readLine().split(" ");
		m=Integer.parseInt(temp1[0]);
		n=Integer.parseInt(temp1[1]);
		int[][] box=new int[n][m];
		ArrayList<Tomato> day=new ArrayList<>();
		int max=0;
		for(int i=0; i<n; i++) {
			String[] temp2=br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				int element=Integer.parseInt(temp2[j]);
				box[i][j]=element;
				if(element!=-1) max++;
				if(element==1) day.add(new Tomato(i, j));
			}
		}
		br.close();
		bw.append(String.valueOf(new 토마토_BFS().solution(box, day, max))).close();
	}
}

//class Tomato{
//	int x, y;
//	public Tomato(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
//}
//
//public class Main {
//	static int[] dx= {1, 0, -1, 0};
//	static int[] dy= {0, 1, 0, -1};
//	static int[][] board, dist;
//	static int n, m;
//	static Queue<Tomato> queue=new LinkedList<>();
//	
//	public void solution() {
//		while(!queue.isEmpty()) {
//			Tomato temp=queue.poll();
//			for(int i=0; i<4; i++) {
//				int nx=temp.x+dx[i];
//				int ny=temp.y+dy[i];
//				if(nx>-1 && nx<n && ny>-1 && ny<m && board[nx][ny]==0) {
//					board[nx][ny]=1;
//					queue.offer(new Tomato(nx, ny));
//					dist[nx][ny]=dist[temp.x][temp.y]+1;
//				}
//			}
//		}
//	}
//	
//	public static void main(String[] args) throws Exception {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] temp1=br.readLine().split(" ");
//		m=Integer.parseInt(temp1[0]);
//		n=Integer.parseInt(temp1[1]);
//		board=new int[n][m];
//		dist=new int[n][m];
//		for(int i=0; i<n; i++) {
//			String[] temp2=br.readLine().split(" ");
//			for(int j=0; j<m; j++) {
//				board[i][j]=Integer.parseInt(temp2[j]);
//				if(board[i][j]==1) queue.offer(new Tomato(i, j));
//			}
//		}
//		br.close();
//		new Main().solution();
//		boolean flag=true;
//		int answer=Integer.MIN_VALUE;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<m; j++) {
//				if(board[i][j]==0) flag=false;
//			}
//		}
//		if(flag) {
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<m; j++) {
//					answer=Math.max(answer, dist[i][j]);
//				}
//			}
//			bw.append(String.valueOf(answer));
//		}
//		else bw.append("-1");
//		bw.close();
//	}
//}