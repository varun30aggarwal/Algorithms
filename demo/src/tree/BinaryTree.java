package tree;

import java.util.ArrayList;
import java.util.List;




public class BinaryTree {
     
	Node root;
	static ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
	
	static int sums =0;
	 public static List<List<Integer>> pathSum(Node root, int sum) {
		 sums=sum;
		 List list = new ArrayList<Integer>(); 
		 PreOrder(root,list);
		    return result;
		 
	 }

public static void PreOrder(Node node,List<Integer> list){
    if( node != null){
        //visit
        ArrayList<Integer> newlist = new ArrayList<Integer>(list);
        newlist.add(node.key);
        if(node.left == null && node.right == null){// leaf node
            if(getsum(newlist) == sums){
                result.add(newlist);
            }
        }
        
        
        
        PreOrder(node.left,newlist);
        PreOrder(node.right,newlist);
    }
}
public static int getsum(List<Integer> list){
    int count = 0 ;
    for(Integer i : list){
        count+=i;
    }
    return count;
}
	 public static int getSubSum(Node root)
	 {
		 int left= (root.left==null)?0: getSubSum(root.left);
         System.out.println("left"+left);  
   int right=   (root.right==null)?0: getSubSum(root.right);
    System.out.println("right"+right);
      int s1=root.key+left+right;
       System.out.println("sum"+s1);
       
       return s1;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

 //height=tree.height(root);
        List<List<Integer>> pathSum = new ArrayList<>();
        pathSum=pathSum(tree.root, 7);
		int subTreeSum = getSubSum(tree.root);
	}

}
