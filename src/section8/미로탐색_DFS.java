package section8;

import java.util.*;

public class 미로탐색_DFS {
	static int[] dx= {1, 0, -1, 0}, dy= {0, 1, 0, -1};
	static int[][] map=new int[7][7];
	static int answer=0;
	public void solution(int x, int y) {
		if(x==6 && y==6) answer++;
		else {
			map[x][y]=1;
			for(int i=0; i<4; i++) {
				int nx=x+dx[i], ny=y+dy[i];
				if(nx>-1 && nx<7 && ny>-1 && ny<7 && map[nx][ny]==0) {
					solution(nx, ny);
					map[nx][ny]=0;
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
		map[0][0]=1;
		new 미로탐색_DFS().solution(0, 0);
		System.out.println(answer);
	}
}