package tree;

class Tree{
	class Node{
		char data;
		Node left, right;
	}
	Node root;
	
	public Node getRoot() {
		return root;
	}
	
	public void setRoot(Node root) {
		this.root =root;
	}
	public Node makeTree(Node left,char data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	public void preorder(Node node) {
		if(node != null) {
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	public void inorder(Node node) {
		if(node != null) {
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	public void postorder(Node node) {
		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
	}
}	

public class TreeTest {
	public static void main(String[] args) {
		Tree o = new Tree();
		Tree.Node n = o.new Node();
		n.data = 'A';
		
		Tree.Node n2 = new Tree().new Node();
		n2.data = 'B';
		// 위 두개는 같은 문장 외부클래스가 내부클래스에 있을때 객체 생성을 먼저 해주고 안쪽에 접근해서 생성
		
		Tree t = new Tree();
		
		Tree.Node d = t.makeTree(null, 'D', null);
		Tree.Node h = t.makeTree(null, 'H', null);
		Tree.Node i = t.makeTree(null, 'I', null);
		Tree.Node f = t.makeTree(null, 'F', null);
		Tree.Node g = t.makeTree(null, 'G', null);
		
		Tree.Node e = t.makeTree(h, 'E', i);
		Tree.Node b = t.makeTree(d, 'B', e);
		Tree.Node c = t.makeTree(f, 'C', g);
	
		Tree.Node a = t.makeTree(b, 'A', c);
		
		t.setRoot(a);
		
		Tree.Node r = t.getRoot();
		t.preorder(r);
		System.out.println();
		t.inorder(r);
		System.out.println();
		t.postorder(r);
		System.out.println();
		
	}
}
