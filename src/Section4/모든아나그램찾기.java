package section4;

import java.util.*;

public class 모든아나그램찾기 {
//	public int solution(String s, String t) {
//		int answer=0;
//		HashMap<Character, Integer> map1=new HashMap<>();
//		HashMap<Character, Integer> map2=new HashMap<>();
//		for(int i=0; i<t.length()-1; i++) {
//			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
//			map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
//		}
//		map2.put(t.charAt(t.length()-1), map2.getOrDefault(t.charAt(t.length()-1), 0)+1);
//		int lt=0;
//		for(int rt=t.length()-1; rt<s.length(); rt++) {
//			map1.put(s.charAt(rt), map1.getOrDefault(s.charAt(rt), 0)+1);
//			if(map1.equals(map2)) answer++;
//			map1.put(s.charAt(lt), map1.get(s.charAt(lt))-1);
//			if(map1.get(s.charAt(lt))==0) map1.remove(s.charAt(lt));
//			lt++;
//		}
//		return answer;
//	}
	
	public int solution(String s, String t) {
		int answer=0;
		HashMap<Character, Integer> sm=new HashMap<>();
		HashMap<Character, Integer> tm=new HashMap<>();
		for(char c : t.toCharArray()) tm.put(c, tm.getOrDefault(c, 0)+1);
		int len=t.length()-1;
		for(int i=0; i<len; i++) sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0)+1);
		int lt=0;
		for(int rt=len; rt<s.length(); rt++) {
			sm.put(s.charAt(rt), sm.getOrDefault(s.charAt(rt), 0)+1);
			if(sm.equals(tm)) answer++;
			sm.put(s.charAt(lt), sm.get(s.charAt(lt))-1);
			if(sm.get(s.charAt(lt))==0) sm.remove(s.charAt(lt));
			lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		sc.close();
		System.out.println(new 모든아나그램찾기().solution(s, t));
		return;
	}
}
