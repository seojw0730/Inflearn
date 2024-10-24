package Section4;

import java.util.*;

public class K번째큰수 {
	public int solution(int n, int k, int[] arr) {
		int answer=-1;
		//TreeSet<Integer> set=new TreeSet<>();//오름차순 
		TreeSet<Integer> set=new TreeSet<>(Collections.reverseOrder());//내림차순
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					set.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0;
		//set.remove(143); 요소 제거
		//System.out.println("size: "+set.size());//크기 출력
		//System.out.println("first: "+set.first());//오름차순-최솟값, 내림차순-최댓값
		//System.out.println("last: "+set.last());//오름차순-최댓값, 내림차순-최솟값
		for(int i : set) {
			System.out.println(i);
			cnt++;
			if(cnt==k) return i;
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
		System.out.println(new K번째큰수().solution(n, k, arr));
		return;
	}
}
