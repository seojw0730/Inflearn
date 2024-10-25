package Section5;

import java.util.*;

public class 교육과정설계 {
//	public String solution(String str1, String str2) {
//		String answer="NO";
//		Queue<Character> queue=new LinkedList<>();
//		for(int i=0; i<str1.length(); i++) queue.offer(str1.charAt(i));
//		for(int i=0; i<str2.length(); i++) {
//			if(queue.element()==str2.charAt(i)) queue.poll();
//			if(queue.size()==0) return "YES";
//		}
//		return answer;
//	}
	
	public String solution(String str1, String str2) {
		String answer="YES";
		Queue<Character> queue=new LinkedList<>();
		for(char c : str1.toCharArray()) queue.offer(c);
		for(char c : str2.toCharArray()) {
			if(queue.contains(c)) {
				if(c!=queue.poll()) return "NO";
			}
		}
		if(!queue.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		sc.close();
		System.out.println(new 교육과정설계().solution(str1, str2));
		return;
	}
}
