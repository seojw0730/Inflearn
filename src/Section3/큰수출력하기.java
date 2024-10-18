package Section3;

import java.util.*;

public class 큰수출력하기 {
	public ArrayList<Integer> solution(int N, int[] arr) {
		ArrayList<Integer> answer=new ArrayList<Integer>();
		answer.add(arr[0]);
		for(int i=1; i<N; i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i : new 큰수출력하기().solution(N, arr)) {
			System.out.print(i+" ");
		}
		return;
	}
}
