package section8;

import java.util.*;

class Point2{
	int x, y;
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class 미로의최단거리통로_BFS {
	static int[] dx= {1, 0, -1, 0};
	static int[] dy= {0, 1, 0, -1};
	static int[][] map=new int[7][7], dist=new int[7][7];
	
	public void solution(int x, int y) {
		Queue<Point2> queue=new LinkedList<>();
		queue.offer(new Point2(x, y));
		map[x][y]=1;
		while(!queue.isEmpty()) {
			Point2 temp=queue.poll();
			for(int i=0; i<4; i++) {
				int nx=temp.x+dx[i];
				int ny=temp.y+dy[i];
				if(nx>-1 && nx<7 && ny>-1 && ny<7 && map[nx][ny]==0) {
					map[nx][ny]=1;
					queue.offer(new Point2(nx, ny));
					dist[nx][ny]=dist[temp.x][temp.y]+1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				map[i][j]=sc.nextInt();
			}
		}
		sc.close();
		new 미로의최단거리통로_BFS().solution(0, 0);
		if(dist[6][6]==0) System.out.println(-1);
		else System.out.println(dist[6][6]);
	}
}
