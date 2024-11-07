package section5;

import java.util.*;

class Person{
	int id, priority;
	public Person(int id, int priority) {
		this.id=id;
		this.priority=priority;
	}
}

public class 응급실 {
	public int solution(int n, int m, int[] arr) {
		int answer=0;
		Queue<Person> queue=new LinkedList<>();
		for(int i=0; i<n; i++) {
			queue.offer(new Person(i, arr[i]));
		}
		while(!queue.isEmpty()) {
			Person temp=queue.poll();
			for(Person p : queue) {
				if(p.priority>temp.priority) {
					queue.offer(temp);
					temp=null;
					break;
				}
			}
			if(temp!=null) {
				answer++;
				if(temp.id==m) return answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(new 응급실().solution(n, m, arr));
		return;
	}
}
