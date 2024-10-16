package Section2;

import java.util.*;

public class 유효한팰린드롬 {
	public String solution(String str) {
		String answer="NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String temp=new StringBuilder(str).reverse().toString();
		if(str.equals(temp)) {
			answer="YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine(); // 띄어쓰기 있어서 nextLine()
		sc.close();
		System.out.println(new 유효한팰린드롬().solution(str));
		return;
	}
}
