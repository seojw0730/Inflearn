package Section2;

import java.util.*;

public class 문장속단어 {
	public String solution(String str) {
		String answer = "";
		String[] strArr = str.split(" ");
		
		int len = Integer.MIN_VALUE;
		/*
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].length() > len) {
				answer = strArr[i];
				len = answer.length();
			}
		}
		
		for(String s : strArr) {
			if(s.length() > len) {
				answer = s;
				len = answer.length();
			}
		}
		 */

		int pos;
		while((pos = str.indexOf(" ")) != -1) {
			String temp = str.substring(0, pos);
			int m = temp.length();
			if(m > len) {
				len = m;
				answer = temp;
			}
			
			str = str.substring(pos+1);
		}
		
		if(str.length() > len) {
			answer = str;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		문장속단어 T = new 문장속단어();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(T.solution(str));
		return;
	}
}
