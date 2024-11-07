package section6;

import java.util.*;

public class 중복확인 {
//	public char solution(int n, int[] arr) {
//		char answer='U';
//		Arrays.sort(arr);
//		for(int i=0; i<n-1; i++) {
//			if(arr[i]==arr[i+1]) return 'D';
//		}
//		return answer;
//	}
	
//	public char solution(int n, int[] arr) {
//		char answer='U';
//		HashMap<Integer, Integer> map=new HashMap<>();
//		for(int i=0; i<n; i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//			if(map.get(arr[i])>1) return 'D';
//		}
//		return answer;
//	}
	
	public String solution(int n, int[] arr) {
		String answer="U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) return "D";
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
		System.out.println(new 중복확인().solution(n, arr));
		return;
	}
}
