package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum3 {

/*	
	  public List<List<Integer>> combinationSum3(int k, int sum) {
	      
		  List<List<Integer>> ls = new ArrayList<List<Integer>>();
		  int ar[]= new int[10];
		 
		  Arrays.fill(ar, -1);
		  for(int i =1;i<sum;i++)
		  { List <Integer> bs=null;
			  int temp=sum-i;
			  for(int j =i+1;j<sum;j++)
			  { bs= new ArrayList<>();
				  if((temp-j)>0 && (temp-j)<=9){
				  if((ar[temp-j]==-1) &&(temp-j!=j)&&(temp-j!=i)&&(temp-j>j))
				  {
					  ar[j]=1;
					  ar[temp-j]=1;
					  bs.add(i);
					  bs.add(j);
					  bs.add(temp-j);
					  ls.add(bs); 
				  }
				 
			  }
				  
			  }
			  Arrays.fill(ar, -1);
			  
			  
		  }
		  
		  return ls;
	    }*/
	  public List<List<Integer>> combinationSums3(int k, int n) {
		    int[] num = {1,2,3,4,5,6,7,8,9};
		    List<List<Integer>> result = new ArrayList<List<Integer>>();
		    helper(result, new ArrayList<Integer>(), num, k, n,0);
		    return result;
		    }

		public void helper(List<List<Integer>> result, List<Integer> list, int[] num, int k, int target, int start){
		    if (k == 0 && target == 0){
		        result.add(new ArrayList<Integer>(list));
		    } else {
		        for (int i = start; i < num.length && target > 0 && k >0; i++){
		            list.add(num[i]);
		            helper(result, list, num, k-1,target-num[i],i+1);
		            list.remove(list.size()-1);
		        }
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 List<List<Integer>>ls = new ArrayList<>();
		 CombinationSum3 cs = new CombinationSum3();
		 ls=cs.combinationSums3(3, 9);
		 for(List<Integer> i:ls)
			{
				System.out.print(i+ " ");
			}
	}

}
