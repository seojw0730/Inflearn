package Section4;

import java.util.*;

public class 아나그램 {
//	public String solution(String s1, String s2) {
//		String answer;
//		HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
//		for(char c : s1.toCharArray()) {
//			map1.put(c, map1.getOrDefault(c, 0)+1);
//		}
//		HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
//		for(char c : s2.toCharArray()) {
//			map2.put(c, map2.getOrDefault(c, 0)+1);
//		}
//		if(map1.equals(map2)) answer="YES";
//		else answer="NO";
//		return answer;
//	}
	
	public String solution(String s1, String s2) {
		String answer="YES";
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c : s1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c) || map.get(c)==0) return "NO";
			map.put(c, map.get(c)-1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		System.out.println(new 아나그램().solution(s1, s2));
		return;
	}
}
