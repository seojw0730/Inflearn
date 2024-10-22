package Section2;

import java.util.*;

public class 가위바위보 {
//	public String[] solution(int N, int[] A, int[] B) {
//		String[] answer=new String[N];
//		for(int i=0; i<N; i++) {
//			if(A[i]==B[i]) {
//				answer[i]="D";
//			}else if(A[i]==1) {
//				if(B[i]==2) {
//					answer[i]="B";
//				}else {
//					answer[i]="A";
//				}
//			}else if(A[i]==2) {
//				if(B[i]==1) {
//					answer[i]="A";
//				}else {
//					answer[i]="B";
//				}
//			}else {
//				if(B[i]==1) {
//					answer[i]="B";
//				}else {
//					answer[i]="A";
//				}
//			}
//		}
//		return answer;
//	}
	
	public String solution(int N, int[] A, int[] B) {
		String answer="";
		for(int i=0; i<N; i++) {
			if(A[i]==B[i]) {
				answer+="D";
			}else if(A[i]==1 && B[i]==3) {
				answer+="A";
			}else if(A[i]==2 && B[i]==1) {
				answer+="A";
			}else if(A[i]==3 && B[i]==2) {
				answer+="A";
			}else {
				answer+="B";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N], B=new int[N];
		for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			B[i]=sc.nextInt();
		}
		sc.close();
//		for(int i=0; i<N; i++) {
//			System.out.println(new Main().solution(N, A, B)[i]);
//		}
		for(char c : new 가위바위보().solution(N, A, B).toCharArray()) {
			System.out.println(c);
		}
		return;
	}
}
