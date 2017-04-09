package tree;
/*public class Node1{
	int data;
	Node left,right;
	Node(int d)
	{
		data =d;
		left=right=null;
	}
}*/
public class IfBalancedTree {

	Node root;
	
	
	private boolean ifBalanced(Node root)
	{
		if(root==null) return true;
		int lh;
		int rh;
		lh=height(root.left);
		rh=height(root.right);
		if(Math.abs(lh-rh)<=1 && ifBalanced(root.left)&& ifBalanced(root.right)) return true;
		
		return false;
		
	}
	
	private int height(Node node)
	{
		if(node==null) return 0;
		
		return 1+Math.max(height(node.left), height(node.right));
		
	}
	
	public static void main(String[] args) {
		IfBalancedTree bf = new IfBalancedTree();
		bf.root=new Node(1);
		bf.root.left=new Node(2);
		bf.root.right=new Node(3);
		bf.root.left.right=new Node(4);
		bf.root.left.left=new Node(8);
		bf.root.left.left.left=new Node(8);
		if(bf.ifBalanced(bf.root))
			System.out.println("Balanced Tree");
		else
			System.out.println("Not balanced");
		
		
		
		
		
	}
}
