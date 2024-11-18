package section9;

import java.util.*;
import java.io.*;

//class Lec implements Comparable<Lec> {
//	int profit, date;
//	public Lec(int profit, int date) {
//		this.profit=profit;
//		this.date=date;
//	}
//	
//	@Override
//	public int compareTo(Lec o) {
//		if(this.profit==o.profit) return this.date-o.date;
//		else return o.profit-this.profit;
//	}
//}
//
//public class Main {
//	public int solution(List<Lec> list, int n) {
//		int answer=0, total=Integer.MIN_VALUE;
//		for(Lec lec : list) {
//			if(total<lec.date) total=lec.date;
//		}
//		Collections.sort(list);
//		int[] chk=new int[total];
//		for(Lec lec : list) {
//			for(int i=lec.date-1; i>=0; i--) {
//				if(chk[i]==0) {
//					chk[i]=1;
//					answer+=lec.profit;
//					break;
//				}
//			}
//		}
//		return answer;
//	}
//	
//	public static void main(String[] args) throws Exception {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		int n=Integer.parseInt(br.readLine());
//		List<Lec> list=new ArrayList<>();
//		for(int i=0; i<n; i++) {
//			String[] temp=br.readLine().split(" ");
//			list.add(new Lec(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
//		}
//		br.close();
//		bw.append(String.valueOf(new Main().solution(list, n))).close();
//	}
//}

class Lec implements Comparable<Lec> {
	public int profit, date;
	public Lec(int profit, int date) {
		this.profit=profit;
		this.date=date;
	}
	
	@Override
	public int compareTo(Lec o) {
		return o.date-this.date;
	}
}

public class 최대수입스케줄 {
	static int max=Integer.MIN_VALUE;
	public int solution(List<Lec> list, int n) {
		int answer=0;
		PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(list);
		int j=0;
		for(int i=max; i>=1; i--) {
			for(; j<n; j++) {
				if(list.get(j).date<i) break;
				else queue.offer(list.get(j).profit);
			}
			if(!queue.isEmpty()) answer+=queue.poll();
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		List<Lec> list=new ArrayList<>();
		for(int i=0; i<n; i++) {
			String[] temp=br.readLine().split(" ");
			int profit=Integer.parseInt(temp[0]);
			int date=Integer.parseInt(temp[1]);
			list.add(new Lec(profit, date));
			if(date>max) max=date;
		}
		br.close();
		bw.append(String.valueOf(new 최대수입스케줄().solution(list, n))).close();
	}
}
