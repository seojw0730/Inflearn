package Section1;

import java.util.*;

public class 문자열압축 {
//	public String solution(String s) {
//		char temp=s.charAt(0);
//		int cnt=1;
//		StringBuilder sb=new StringBuilder();
//		sb.append(temp);
//		for(int i=1; i<s.length(); i++) {
//			if(s.charAt(i)==temp) {
//				cnt++;
//				if(i==s.length()-1) {
//					sb.append(cnt);
//				}
//			}else {
//				if(cnt==1) {
//					sb.append(s.charAt(i));
//				}else {
//					sb.append(cnt).append(s.charAt(i));
//				}
//				cnt=1;
//			}
//			temp=s.charAt(i);
//		}
//		return sb.toString();
//	}
	
	public String solution(String s) {
		String answer="";
		s=s+" ";
		int cnt=1;
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				cnt++;
			}else {
				answer+=s.charAt(i);
				if(cnt>1) {
					answer+=cnt;
				}
				cnt=1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 문자열압축().solution(s));
		return;
	}
}
