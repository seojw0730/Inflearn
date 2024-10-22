package Section4;

import java.util.*;

public class 매출액의종류 {
//	public ArrayList<Integer> solution(int n, int k, int[] arr) {
//		ArrayList<Integer> answer=new ArrayList<>();
//		HashMap<Integer, Integer> map=new HashMap<>();
//		for(int i=0; i<k; i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//		}
//		answer.add(map.size());
//		for(int i=k; i<n; i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//			if(map.get(arr[i-k])>1) {
//				map.put(arr[i-k], map.get(arr[i-k])-1);
//			}else {
//				map.remove(arr[i-k]);
//			}
//			answer.add(map.size());
//		}
//		return answer;
//	}
	
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer=new ArrayList<>();
		HashMap<Integer, Integer> HM=new HashMap<>();
		for(int i=0; i<k-1; i++) {
			HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
		}
		int lt=0;
		for(int rt=k-1; rt<n; rt++) {
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
			answer.add(HM.size());
			HM.put(arr[lt], HM.get(arr[lt])-1);
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
			lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i : new 매출액의종류().solution(n, k, arr)) {
			System.out.print(i+" ");
		}
		return;
	}
}
