package Section5;

import java.util.*;

public class 크레인인형뽑기 {
//	public int solution(int n, int[][] board, int m, int[] moves) {
//		int answer=0;
//		Stack<Integer> stack=new Stack<>();
//		for(int i=0; i<m; i++) {
//			for(int j=0; j<n; j++) {
//				if(board[j][moves[i]-1]!=0) {
//					stack.push(board[j][moves[i]-1]);
//					board[j][moves[i]-1]=0;
//					break;
//				}
//			}
//			if(stack.size()>1) {
//				if(stack.get(stack.size()-1)==stack.get(stack.size()-2)) {
//					stack.pop();
//					stack.pop();
//					answer+=2;
//				}
//			}
//		}
//		return answer;
//	}
	
	public int solution(int[][] board, int[] moves) {
		int answer=0;
		Stack<Integer> stack=new Stack<>();
		for(int pos : moves) {
			for(int i=0; i<board.length; i++) {
				if(board[i][pos-1]!=0) {
					int temp=board[i][pos-1];
					board[i][pos-1]=0;
					if(!stack.isEmpty() && temp==stack.peek()) {
						answer+=2;
						stack.pop();
					}
					else stack.push(temp);
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] board=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j]=sc.nextInt();
			}
		}
		int m=sc.nextInt();
		int[] moves=new int[m];
		for(int i=0; i<m; i++) {
			moves[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 크레인인형뽑기().solution(board, moves));
		return;
	}
}
