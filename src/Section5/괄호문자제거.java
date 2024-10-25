package Section5;

import java.util.*;

public class 괄호문자제거 {
//	public String solution(String s) {
//		StringBuilder sb=new StringBuilder();
//		Stack<Character> stack=new Stack<>();
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)=='(') {
//				stack.push(s.charAt(i));
//				continue;
//			}
//			if(s.charAt(i)==')') {
//				stack.pop();
//				continue;
//			}
//			if(stack.size()==0) sb.append(s.charAt(i));
//		}
//		return sb.toString();
//	}
	
	public String solution(String s) {
		String answer="";
		Stack<Character> stack=new Stack<>();
		for(char c : s.toCharArray()) {
			if(c==')') {
				while(stack.pop()!='(');
			}else stack.push(c);
		}
		for(int i=0; i<stack.size(); i++) answer+=stack.get(i);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 괄호문자제거().solution(s));
		return;
	}
}
