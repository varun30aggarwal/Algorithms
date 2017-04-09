package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;
/*can't add immediate link nodes .find max sum node
 * Example 1:
     3
    / \
   2   3
    \   \ 
     3   1
Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
     3
    / \
   4   5
  / \   \ 
 1   3   1
Maximum amount of money the thief can rob = 4 + 5 = 9.
 */




class Node{
	int key;
	Node left,right;
	public Node(int item)
	{
		key=item;
		left=right=null;
	}
}
public class HouseRobbery2 {

	
	public int rob(Node root) {
		// map is used because we don't need to revisit the subnodes again and again 
	    Map<Node, Integer> map = new HashMap<>();
	    return robSub(root, map);
	}

	private int robSub(Node root, Map<Node, Integer> map) {
	    if (root == null) return 0;
	    if (map.containsKey(root)) return map.get(root);
	    
	    int val = 0;
	    
	    if (root.left != null) {
	        val += robSub(root.left.left, map) + robSub(root.left.right, map);
	    }
	    
	    if (root.right != null) {
	        val += robSub(root.right.left, map) + robSub(root.right.right, map);
	    }
	    // as rob(root.left)or right will revisit the nodes so to avaoid revisiting the nodes again we used hashmap
	    val = Math.max(val + root.key, robSub(root.left, map) + robSub(root.right, map));
	    map.put(root, val);
	    
	    return val;
	}
	Node root;
	
	
	public static void main(String[] args) {
		
		
		HouseRobbery2 tree = new HouseRobbery2();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.left.right = new Node(13);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(4);
      
        
        int sum = tree.rob(tree.root);
        System.out.println(sum);
	}

}
