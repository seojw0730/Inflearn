package Section4;

import java.util.*;

public class 학급회장 {
//	public char solution(int n, String s) {
//		char answer='A';
//		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
//		char[] temp= {'A', 'B', 'C', 'D', 'E'};
//		for(int i=0; i<5; i++) {
//			map.put(temp[i], 0);
//		}
//		char[] c=s.toCharArray();
//		for(int i=0; i<c.length; i++) {
//			map.put(c[i], map.get(c[i])+1);
//		}
//		int max=map.get('A');
//		for(int i=0; i<temp.length; i++) {
//			if(map.get(temp[i])>max) {
//				answer=temp[i];
//				max=map.get(temp[i]);
//			}
//		}
//		return answer;
//	}
	
//	public char solution(int n, String s) {
//		char answer=' ';
//		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
//		for(char c : s.toCharArray()) {
//			map.put(c, map.getOrDefault(c, 0)+1);
//		}
//		int max=Integer.MIN_VALUE;
//		for(char key : map.keySet()) {
//			if(map.get(key)>max) {
//				max=map.get(key);
//				answer=key;
//			}
//		}
//		return answer;
//	}
	
	public char solution(int n, String s) {
		char answer=' ';
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map.containsKey('A'));
		System.out.println(map.containsValue(0));
		System.out.println(map.size()); // key 개수
		System.out.println(map.remove('A')); // value 반환
		int max=Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.get(key)>max) {
				max=map.get(key);
				answer=key;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		sc.close();
		System.out.println(new 학급회장().solution(n, s));
		return;
	}
}
