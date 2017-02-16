package tree;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Rightview {

	Node root;
	public List<Integer> rightSideView(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(Node curr, List<Integer> result, int currDepth){
        if(curr == null){
        	
        
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.key);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rightview rs= new Rightview();
		rs.root= new Node(3);
		rs.root.left= new Node(2);
		rs.root.right= new Node(4);
		rs.root.left.left= new Node(3);
		rs.root.left.left.left= new Node(39);
		rs.root.right= new Node(13);
		 List<Integer> result = rs.rightSideView(rs.root);		
		
	}

}
