package section10;

import java.util.*;
import java.io.*;

class Brick implements Comparable<Brick> {
	int s, h, w;
	Brick(int s, int h, int w) {
		this.s = s;
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Brick o) {
		return o.s - this.s;
	}
}

public class 가장높은탑쌓기 {
	int[] dy;
	
	public int solution(int n, List<Brick> list) {
		int answer = 0;
		
		if(n == 1) return list.get(0).h;
		
		dy = new int[n];
		dy[0] = list.get(0).h;
		for(int i = 1; i < n; i++) {
			int temp = 0;
			for(int j = 0; j < i; j++) {
				int w = list.get(i).w;
				if(list.get(j).w >= w) temp = Math.max(temp, dy[j]);
			}
			dy[i] = temp + list.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		List<Brick> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int s = Integer.parseInt(input[0]);
			int h = Integer.parseInt(input[1]);
			int w = Integer.parseInt(input[2]);
			list.add(new Brick(s, h, w));
		}
		br.close();
		Collections.sort(list);
		bw.append(String.valueOf(new 가장높은탑쌓기().solution(n, list))).close();
	}
}