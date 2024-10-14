package Section2;

import java.util.*;

public class 대소문자변환 {
	public String solution(String str) {
		String answer = "";
		
		/*
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c < 'a') { // A = 65, a = 97
				answer += Character.toLowerCase(c);
			}else {
				answer += Character.toUpperCase(c);
			}
		}
		 */
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}else {
				answer += Character.toLowerCase(x);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		대소문자변환 T = new 대소문자변환();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(T.solution(str));
		return;
	}
}
