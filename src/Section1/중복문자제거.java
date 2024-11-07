package section1;

import java.util.*;

public class 중복문자제거 {
//	public String solution(String str) {
//		char[] c=str.toCharArray();
//		int lt=0, rt=1;
//		while(true) {
//			if(c[lt]==c[rt]) {
//				c[rt] = '0';
//			}
//			rt++;
//			if(rt==c.length) {
//				lt++;
//				if(lt==c.length-1) {
//					break;
//				}
//				rt=lt+1;
//			}
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i=0; i<c.length; i++) {
//			if(c[i]!='0') {
//				sb.append(c[i]);
//			}
//		}
//		
//		return sb.toString();
//	}
	
	public String solution(String str) {
		String answer="";
		for(int i=0; i<str.length(); i++) {
			// System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) {
				answer+=str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(new 중복문자제거().solution(str));
		return;
	}
}
