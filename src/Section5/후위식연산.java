package Section5;

import java.util.*;

public class 후위식연산 {
	public int solution(String s) {
		int answer=0;
		Stack<Integer> stack=new Stack<>();
		for(char c : s.toCharArray()) {
//			if(Character.isDigit(c)) stack.push(Character.digit(c, 10));
			if(Character.isDigit(c)) stack.push(c-48);
			else {
				int rt=stack.pop();
				int lt=stack.pop();
				if(c=='+') stack.push(lt+rt);
				else if(c=='-') stack.push(lt-rt);
				else if(c=='*') stack.push(lt*rt);
				else if(c=='/') stack.push(lt/rt);
			}
		}
		answer=stack.get(0);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		System.out.println(new 후위식연산().solution(s));
		return;
	}
}
