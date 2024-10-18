package Section2;

import java.util.*;

public class 가장짧은문자거리 {
	public int[] solution(String s, char t) {
		int[] answer=new int[s.length()];
		int p=1000;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==t) {
				p=0;
			}else {
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char t=sc.next().charAt(0);
		sc.close();
		for(int i : new 가장짧은문자거리().solution(s, t)) {
			System.out.print(i+" ");
		}
		return;
	}
}
