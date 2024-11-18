package section9;

import java.util.*;
import java.io.*;

class Time implements Comparable<Time>{
	int start, end;
	public Time(int start, int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.end==o.end) return this.start-o.start;
		else return this.end-o.end;
	}
}

public class 회의실배정 {
	public int solution(List<Time> list, int n) {
		Collections.sort(list);
		int answer=1, time=list.get(0).end;
		for(int i=1; i<n; i++) {
			if(list.get(i).start>=time) {
				answer++;
				time=list.get(i).end;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		List<Time> list=new ArrayList<>();
		for(int i=0; i<n; i++) {
			String[] temp=br.readLine().split(" ");
			list.add(new Time(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
		}
		br.close();
		bw.append(String.valueOf(new 회의실배정().solution(list, n))).close();
	}
}