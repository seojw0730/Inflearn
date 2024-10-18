package Section3;

import java.util.*;

public class 뒤집은소수 {
	public boolean isPrime(int num) {
		if(num==1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer=new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int temp=arr[i];
			int res=0;
			while(temp>0) {
				int t=temp%10;
				res=res*10+t;
				temp/=10;
			}
			if(isPrime(res)) {
				answer.add(res);
			}
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
		for(int i : new 뒤집은소수().solution(n, arr)) {
			System.out.print(i+" ");
		}
		return;
	}
}
