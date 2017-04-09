package tree;


class Node{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
	}
}

public class PathSum1 {
     
	Node root;
	public PathSum1() {
	          root=null;
	}
	public void printPostOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.key+"");
	}
	public void printinOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		printinOrder(node.left);
		System.out.print(node.key+"");
		printinOrder(node.right);
		
	}
	public void printPreOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node.key+"");
		printPreOrder(node.left);
		printPreOrder(node.right);
		
	}
	 public int minDepth(Node root) {
	       if (root==null) return 0;
	       
	       
	       int left=minDepth(root.left);
	       System.out.println(left+";");
	       int right=minDepth(root.right);
	        System.out.println(right+"---");
	       return (left==0||right==0)?right+left+1:Math.min(left,right)+1;
	    }
	public int height(Node root)
    {
         
       if(root==null) return -1;
       if(height(root.left)>height(root.right))
           {
           return (1+height(root.left));
       }
       else
           {
           return(1+height(root.right));
       }
       
    }
	 void printPostOrder()  {     printPostOrder(root);  }
	    void printinOrder()    {     printinOrder(root);   }
	    void printPreOrder()   {     printPreOrder(root);  }
	void height(){
		//int a=0;
		int a=height(root);
		System.out.println(a);
	}
	void minHeight()
	{
		int min=minDepth(root);
		System.out.println(min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PathSum1 tree = new PathSum1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(25);
        tree.root.left.right.left.left = new Node(15);
 int height=0;
 //height=tree.height(root);
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreOrder();
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printinOrder();
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostOrder();
        System.out.println("\nHeight of binary tree is ");
        tree.height();
        System.out.println("\nMinHeight of binary tree is ");
        tree.minHeight();
	}

}
