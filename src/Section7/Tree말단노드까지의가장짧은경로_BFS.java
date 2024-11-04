package Section7;

import java.util.*;

class Node5{
	int data;
	Node5 lt, rt;
	public Node5(int data) {
		this.data=data;
		lt=rt=null;
	}
}

public class Tree말단노드까지의가장짧은경로_BFS {
	Node5 root;
	public int BFS(Node5 root) {
		Queue<Node5> queue=new LinkedList<>();
		queue.offer(root);
		int L=0;
		while(!queue.isEmpty()) {
			int len=queue.size();
			for(int i=0; i<len; i++) {
				Node5 curr=queue.poll();
				if(curr.lt==null&&curr.rt==null) return L;
				if(curr.lt!=null) queue.offer(curr.lt);
				if(curr.rt!=null) queue.offer(curr.rt);
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Tree말단노드까지의가장짧은경로_BFS tree=new Tree말단노드까지의가장짧은경로_BFS();
		tree.root=new Node5(1);
		tree.root.lt=new Node5(2);
		tree.root.rt=new Node5(3);
		tree.root.lt.lt=new Node5(4);
		tree.root.lt.rt=new Node5(5);
		System.out.println(tree.BFS(tree.root));
	}
}
