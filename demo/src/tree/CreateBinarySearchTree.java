package tree;

public class CreateBinarySearchTree {
static Node root;
	
	
	private Node bSearch(int a[],int start,int end)
	{
		
		if (start>end) return null;
		
		int mid = (start+end)/2;
		Node node = new Node(a[mid]);
		node.left=bSearch(a,start,mid-1);
		node.right=bSearch(a, mid+1, end);
		
		return node;
	}
	private void preOrder(Node root)
	{
		if(root==null) return;
		System.out.print(root.key + " " );
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5,6,7,8,9};
		
		CreateBinarySearchTree bs = new CreateBinarySearchTree();
	root=bs.bSearch(a, 0, a.length-1);
	
		bs.preOrder(root);

	}

}
