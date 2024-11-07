package section7;

import java.util.*;

//class Node3{
//	int fw, L;
//	Node3 lt, mid, rt;
//	public Node3(int fw, int L) {
//		this.fw=fw;
//		this.L=L;
//		lt=mid=rt=null;
//	}
//}

public class 송아지찾기 {
//	Node3 root;
//	public int BFS(Node3 root, int dist) {
//		int answer=0;
//		Queue<Node3> queue=new LinkedList<>();
//		queue.offer(root);
//		boolean exit=false;
//		while(!exit) {
//			int len=queue.size();
//			for(int i=0; i<len; i++) {
//				Node3 curr=queue.poll();
//				curr.lt=new Node3(curr.fw-1, curr.L+1);
//				curr.mid=new Node3(curr.fw+1, curr.L+1);
//				curr.rt=new Node3(curr.fw+5, curr.L+1);
//				queue.offer(curr.lt);
//				queue.offer(curr.mid);
//				queue.offer(curr.rt);
//				if(curr.lt.fw==dist || curr.mid.fw==dist || curr.rt.fw==dist) {
//					exit=true;
//					answer=curr.L+1;
//					break;
//				}
//			}
//		}
//		return answer;
//	}
	
	int[] dist= {1, -1, 5};
	int[] chk;
	Queue<Integer> Q=new LinkedList<>();
	public int BFS(int s, int e) {
		chk=new int[10001];
		chk[s]=1;
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()) {
			int len=Q.size();
			for(int i=0; i<len; i++) {
				int x=Q.poll();
				for(int j=0; j<3; j++) {
					int nx=x+dist[j];
					if(nx==e) return L+1;
					if(nx>=1 && nx<=10000 && chk[nx]==0) {
						chk[nx]=1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int s=sc.nextInt();
//		int e=sc.nextInt();
//		sc.close();
//		int dist=e-s;
//		Main tree=new Main();
//		tree.root=new Node3(0, 0);
//		System.out.println(tree.BFS(tree.root, dist));
//	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		sc.close();
		System.out.println(new 송아지찾기().BFS(s, e));
	}
}