package Section2;

import java.util.*;

//public class Main {
//	public String solution(String str) {
//		StringBuilder sb = new StringBuilder();
//		sb.append(str);
//		sb.reverse();
//		return sb.toString();
//	}
//	
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		for(int i = 0; i < N; i++) {
//			String str = sc.next();
//			System.out.println(T.solution(str));
//		}
//		sc.close();
//	}
//}

//public class Main {
//	public ArrayList<String> solution(int n, String[] str){
//		ArrayList<String> answer = new ArrayList<String>();
//		for(String s : str) {
//			String temp = new StringBuilder(s).reverse().toString();
//			answer.add(temp);
//		}
//		
//		return answer;
//	}
//	
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String[] str = new String[n];
//		for(int i = 0; i < n; i++) {
//			str[i] = sc.next();
//		}
//		sc.close();
//		for(String s : T.solution(n, str)) {
//			System.out.println(s);
//		}
//		return;
//	}
//}

public class 단어뒤집기 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<String>();
		for(String s : str) {
			char[] c = s.toCharArray();
			int lt = 0, rt = s.length() - 1;
			while(lt < rt) {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
			String temp = String.valueOf(c);
			answer.add(temp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		단어뒤집기 T = new 단어뒤집기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = sc.next();
		}
		sc.close();
		for(String s : T.solution(n, str)) {
			System.out.println(s);
		}
		return;
	}
}

