package Section1;

import java.util.*;

public class 회문문자열 {
//	public String solution(String str) {
//		String answer;
//		str=str.toUpperCase();
//		char[] c=str.toCharArray();
//		int lt=0, rt=str.length()-1;
//		boolean isTrue=true;
//		for(int i=0; i<str.length()/2; i++) {
//			if(c[lt]!=c[rt]) {
//				isTrue=false;
//				break;
//			}
//			lt++;
//			rt--;
//		}
//		if(isTrue) {
//			answer="YES";
//		}else {
//			answer="NO";
//		}
//		return answer;
//	}
	
//	public String solution(String str) {
//		String answer="YES";
//		str=str.toUpperCase();
//		int len=str.length();
//		for(int i=0; i<len/2; i++) {
//			if(str.charAt(i)!=str.charAt(len-i-1)) {
//				answer="NO";
//				break;
//			}
//		}
//		return answer;
//	}
	
	public String solution(String str) {
		String answer="NO";
		// str=str.toUpperCase();
		String temp=new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(temp)) {
			answer="YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		System.out.println(new 회문문자열().solution(str));
		return;
	}
}
