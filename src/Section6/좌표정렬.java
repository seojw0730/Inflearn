package section6;

import java.util.*;

class Point1 implements Comparable<Point1>{
	public int x, y;
	Point1(int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point1 o) {
		if(this.x==o.x) return this.y-o.y; // 음수값이 리턴되도록
		else return this.x-o.x;
	}
}

public class 좌표정렬 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Point1> list=new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			list.add(new Point1(x, y));
		}
		sc.close();
		Collections.sort(list);
		for(Point1 o : list) System.out.println(o.x+" "+o.y);
		return;
	}
}
