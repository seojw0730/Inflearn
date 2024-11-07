package section5;

import java.util.*;

public class 올바른괄호 {
//	public String solution(String s) {
//		String answer;
//		int lt=0, rt=0;
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)=='(') lt++;
//			else rt++;
//			if(lt<rt) return "NO";
//		}
//		if(lt==rt) answer="YES";
//		else answer="NO";
//		return answer;
//	}
	
	public String solution(String s) {
		String answer="YES";
		Stack<Character> stack=new Stack<>();
		for(char c : s.toCharArray()) {
			if(c=='(') stack.push(c);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 올바른괄호().solution(s));
		return;
	}
}
