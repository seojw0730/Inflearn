package section7;

class Node4{
	int data;
	Node4 lt, rt;
	public Node4(int val) {
		this.data=val;
		lt=rt=null;
	}
}
public class Tree말단노드까지의가장짧은경로_DFS {
	Node4 root;
	public int DFS(int L, Node4 root) {
		if(root.lt==null&&root.rt==null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		Tree말단노드까지의가장짧은경로_DFS tree=new Tree말단노드까지의가장짧은경로_DFS();
		tree.root= new Node4(1);
		tree.root.lt=new Node4(2);
		tree.root.rt=new Node4(3);
		tree.root.lt.lt=new Node4(4);
		tree.root.lt.rt=new Node4(5);
		System.out.println(tree.DFS(0, tree.root));
	}
}
