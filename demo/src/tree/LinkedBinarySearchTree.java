package tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedBinarySearchTree {

	static Node root;
	
	
	private ArrayList<LinkedList<Node>> createLevelList(Node root)
	{
		ArrayList<LinkedList<Node>> result = new ArrayList<>();
		LinkedList<Node> current = new LinkedList<>();
		if (root!=null)
		{
			current.add(root);
		}
		
		while(current.size()>0)
		{
			result.add(current);
			LinkedList<Node> parent = current;
			
			current = new LinkedList<Node>();
			for(Node pr:parent)
			{
				if(pr.left!=null)
				{
					current.add(pr.left);
				}
				if(pr.right!=null)
				{
					current.add(pr.right);
				}
			}
		}
		return result;
		
	}
	public static void main(String args[])
	{
		LinkedBinarySearchTree bs = new LinkedBinarySearchTree();
		bs.root= new Node(1);
		bs.root.left=new Node(2);
		bs.root.left.left= new Node(3);
		bs.root.right= new Node(13);
		bs.root.right.left=new Node(5);
		ArrayList<LinkedList<Node>> result =null;
		result =bs.createLevelList(root);
		for(LinkedList<Node> is:result)
		{
		 for(int i =0;i<is.size();i++)
		 {
			 System.out.print(is.get(i).key+ "->");
		 }
		 System.out.println();
		}
		
	}
	
	
}
