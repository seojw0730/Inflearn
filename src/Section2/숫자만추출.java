package Section2;

import java.util.*;

public class 숫자만추출 {
//	public int solution(String str) {
//		int answer=0;
//		str=str.replaceAll("[^0-9]", "");
//		answer=Integer.parseInt(str);
//		return answer;
//	}
	
//	public int solution(String str) {
//		int answer=0;
//		for(char c : str.toCharArray()) {
//			if(c>=48 && c<=57) { // 0 <- 48, 9 <- 57
//				answer=answer*10+(c-48);
//			}
//		}
//		return answer;
//	}
	
	public int solution(String str) {
		String answer="";
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				answer+=c;
			}
		}
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		System.out.println(new 숫자만추출().solution(str));
		return;
	}
}
