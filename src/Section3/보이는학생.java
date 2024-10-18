package Section3;

import java.util.*;

public class 보이는학생 {
	public int solution(int N, int[] arr) {
		int answer=1, max=arr[0];
		for(int i=1; i<N; i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] intArr=new int[N];
		for(int i=0; i<N; i++) {
			intArr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 보이는학생().solution(N, intArr));
		return;
	}
}
