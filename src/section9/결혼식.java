package section9;

import java.util.*;
import java.io.*;

//class Guest implements Comparable<Guest> {
//	int time;
//	char state;
//	public Guest(int time, char state) {
//		this.time=time;
//		this.state=state;
//	}
//	
//	@Override
//	public int compareTo(Guest o) {
//		if(this.time==o.time) return this.state-o.state; 
//		else return this.time-o.time;
//	}
//}
//
//public class 결혼식 {
//	public int solution(List<Guest> list, int n) {
//		int answer=0, cnt=0;
//		Collections.sort(list);
//		for(Guest g : list) {
//			if(g.state=='s') cnt++;
//			else cnt--;
//			answer=Math.max(answer, cnt);
//		}
//		return answer;
//	}
//		
//	public static void main(String[] args) throws Exception {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		int n=Integer.parseInt(br.readLine());
//		List<Guest> list=new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			String[] temp=br.readLine().split(" ");
//			list.add(new Guest(Integer.parseInt(temp[0]), 's'));
//			list.add(new Guest(Integer.parseInt(temp[1]), 'e'));
//		}
//		br.close();
//		bw.append(String.valueOf(new 결혼식().solution(list, n))).close();
//	}
//}

class Guest implements Comparable<Guest> {
	int in, out;
	public Guest(int in, int out) {
		this.in=in;
		this.out=out;
	}
	
	@Override
	public int compareTo(Guest o) {
		if(this.in==o.in) return this.out-o.out;
		else return this.in-o.in;
	}
}

public class 결혼식 {
	public boolean isIn(Guest guest, int time) {
		if(time>=guest.in && time<guest.out) return true;
		else return false;
	}
	
	public int solution(List<Guest> list, int n) {
		int answer=0;
		
//		int[][] arr=new int[n][73];
//		for(int i=0; i<n; i++) {
//			Guest g=list.get(i);
//			for(int j=g.in; j<g.out; j++) {
//				arr[i][j]=1;
//			}
//		}
//		for(int i=0; i<arr[0].length; i++) {
//			int temp=0;
//			for(int j=0; j<n; j++) {
//				temp+=arr[j][i];
//			}
//			answer=Math.max(answer, temp);
//		}
		
		Collections.sort(list);
		for(int i=list.get(0).in; i<=list.get(n-1).out; i++) {
			int temp=0;
			for(Guest g : list) {
				if(isIn(g, i)) temp++;
			}
			answer=Math.max(answer, temp);
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		List<Guest> list=new ArrayList<>();
		for(int i=0; i<n; i++) {
			String[] temp=br.readLine().split(" ");
			list.add(new Guest(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
		}
		br.close();
		bw.append(String.valueOf(new 결혼식().solution(list, n))).close();
	}
}
