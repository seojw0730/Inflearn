package section9;

import java.util.*;
import java.io.*;

class Body implements Comparable<Body>{
	int height, weight;
	public Body(int height, int weight) {
		this.height=height;
		this.weight=weight;
	}
	
	@Override
	public int compareTo(Body o) {
		return o.height-this.height; // 내림차순
	}
}

public class 씨름선수 {
	public int solution(List<Body> list) {
		int answer=0, weight=Integer.MIN_VALUE;
		Collections.sort(list);
		for(Body b : list) {
			int temp=b.weight;
			if(temp>weight) {
				weight=temp;
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		List<Body> list=new LinkedList<>();
		for(int i=0; i<n; i++) {
			String[] temp=br.readLine().split(" ");
			for(int j=0; j<2; j++) {
				list.add(new Body(Integer.parseInt(temp[0]), Integer.parseInt(temp[1])));
			}
		}
		br.close();
		bw.append(String.valueOf(new 씨름선수().solution(list))).close();
	}
}