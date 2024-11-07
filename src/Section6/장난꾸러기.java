package section6;

import java.util.*;

public class 장난꾸러기 {
//	public int[] solution(int n, int[] arr) {
//		int[] answer=new int[2];
//		int[] temp=new int[n];
//		for(int i=0; i<n; i++) {
//			temp[i]=arr[i];
//		}
//		Arrays.sort(temp);
//		int idx=0;
//		for(int i=0; i<n; i++) {
//			if(arr[i]!=temp[i]) {
//				if(idx==0) {
//					answer[0]=i+1;
//					idx++;
//				}else {
//					answer[1]=i+1;
//				}
//			}
//		}
//		return answer;
//	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer=new ArrayList<>();
		int[] temp=arr.clone();
		Arrays.sort(temp);
		for(int i=0; i<n; i++) {
			if(arr[i]!=temp[i]) answer.add(i+1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i : new 장난꾸러기().solution(n, arr)) {
			System.out.print(i+" ");
		}
		return;
	}
}
