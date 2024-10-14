package Section2;

import java.util.*;

public class 문자찾기 {
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		/*
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == t) {
				answer++;
			}
		}
		*/
		
		for(char x : str.toCharArray()) {
			if(x == t) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		문자찾기 T = new 문자찾기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		sc.close();
		System.out.print(T.solution(str, c));
		return;
	}
}