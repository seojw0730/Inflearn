package Section5;

import java.util.*;

public class 쇠막대기 {
//	public int solution(String s) {
//		int answer=0, cnt=1;
//		for(int i=1; i<s.length(); i++) {
//			char prev=s.charAt(i-1);
//			char now=s.charAt(i);
//			if(now=='(') cnt++;
//			if(prev=='(' && now==')') {
//				cnt--;
//				answer+=cnt;
//			}else if(prev==')' && now==')') {
//				cnt--;
//				answer++;
//			}
//		}
//		return answer;
//	}
	
	public int solution(String s) {
		int answer=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') stack.push('(');
			else {
				stack.pop();
				if(s.charAt(i-1)=='(') answer+=stack.size();
				else answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 쇠막대기().solution(s));
		return;
	}
}
