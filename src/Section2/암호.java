package Section2;

import java.util.*;

public class 암호 {
//	public String solution(int n, String s) {
//		String answer="";
//		for(int i=0; i<n; i++) {
//			String temp=s.substring(7*i, 7*(i+1));
//			temp=temp.replaceAll("[#]", "1").replaceAll("[*]", "0");
//			char c=(char) Integer.parseInt(temp, 2);
//			answer+=c;
//		}
//		return answer;
//	}
	
	public String solution(int n, String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append((char)Integer.parseInt(s.substring(0, 7).replace('#', '1').replace('*', '0'), 2));
			s=s.substring(7);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		sc.close();
		System.out.println(new 암호().solution(n, s));
		return;
	}
}
