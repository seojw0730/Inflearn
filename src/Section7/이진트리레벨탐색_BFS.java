package Section7;

import java.util.*;

class Node2{
	int data;
	Node2 lt, rt;
	public Node2(int val) {
		data=val;
		lt=rt=null;
	}
}

public class 이진트리레벨탐색_BFS {
	Node2 root;
	public void BFS(Node2 root) {
		Queue<Node2> queue=new LinkedList<>();
		queue.offer(root);
		int L=0;
		while(!queue.isEmpty()) {
			int len=queue.size();
			System.out.print(L+": ");
			for(int i=0; i<len; i++) {
				Node2 curr=queue.poll();
				System.out.print(curr.data+" ");
				if(curr.lt!=null) queue.offer(curr.lt);
				if(curr.rt!=null) queue.offer(curr.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		이진트리레벨탐색_BFS tree=new 이진트리레벨탐색_BFS();
		tree.root=new Node2(1);
		tree.root.lt=new Node2(2);
		tree.root.rt=new Node2(3);
		tree.root.lt.lt=new Node2(4);
		tree.root.lt.rt=new Node2(5);
		tree.root.rt.lt=new Node2(6);
		tree.root.rt.rt=new Node2(7);
		tree.BFS(tree.root);
	}
}