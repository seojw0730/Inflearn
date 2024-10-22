package Section2;

import java.util.*;

public class 봉우리 {
//	public int solution(int n, int[][] arr) {
//		int answer=0;
//		for(int i=1; i<n+1; i++) {
//			for(int j=1; j<n+1; j++) {
//				int center=arr[i][j], up=arr[i-1][j], down=arr[i+1][j], left=arr[i][j-1], right=arr[i][j+1];
//				if(center>up && center>down && center>left && center>right) {
//					answer++;
//				}
//			}
//		}
//		return answer;
//	}
	
	public int solution(int n, int[][] arr) {
		int[] dx= {-1, 0, 1, 0};
		int[] dy= {0, 1, 0, -1};
		
		int answer=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag=true;
				for(int k=0; k<4; k++) {
					int nx=i+dx[k];
					int ny=j+dy[k];
					if(nx>=0 && nx<n && ny>= 0 && ny<n && arr[nx][ny]>=arr[i][j]) {
						flag=false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[][] arr=new int[n+2][n+2];
//		for(int i=1; i<n+1; i++) {
//			for(int j=1; j<n+1; j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		sc.close();
//		System.out.println(new Main().solution(n, arr));
//		return;
//	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println(new 봉우리().solution(n, arr));
		return;
	}
}
