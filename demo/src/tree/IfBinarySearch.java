package tree;

public class IfBinarySearch {

	Node root;
public static int last_printed=Integer.MIN_VALUE;	
	
	private boolean ifBinary(Node root)
	{
            if(root==null) return true;
		//boolean gf=false;
 	if(!ifBinary(root.left)) return false;
 	if(root.key<last_printed) return false;
 	last_printed=root.key;
 	if(!ifBinary(root.right)) return false;
 	return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
IfBinarySearch ib = new IfBinarySearch();
ib.root= new Node(11);
ib.root.left=new Node(5);
ib.root.right= new Node(17);
ib.root.right.left= new Node(16);
ib.root.right.right= new Node(18);
		boolean as =ib.ifBinary(ib.root);
		System.out.println(as==true?"Binary":"Not Binary");
		
	}

}
