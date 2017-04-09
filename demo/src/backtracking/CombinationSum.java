package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static List<List<Integer>> combinationsum(int num[],int target)
	{
		List<List<Integer>> list =new ArrayList<>();
		Arrays.sort(num);
		backtrack(list,new ArrayList<Integer>(),num,target,0);
		return list;
	}
	private static void backtrack(List<List<Integer>> list, List<Integer> temparray,int[] num,int remain,int start )
	{
	
		if(remain<0) return;
		else if(remain==0) list.add(new ArrayList<>(temparray));
		else
		{
			for(int i =start;i<num.length;i++)
			{
				temparray.add(num[i]);
				backtrack(list,temparray,num,remain-num[i],i);
				temparray.remove(temparray.size()-1);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		
		List<List<Integer>> list = new ArrayList<>();
		int target =7;
		int num[]=new int[4];
		num[0]=2;
		num[1]=3;
		num[2]=6;
		num[3]=7;
		list=combinationsum(num, target);
		
		for(List<Integer> i:list)
		{
			System.out.println(i);
		}
	}

}
