package dynamicprogramming;

import java.util.Arrays;

public class MaximumSumSubaaray {

	private static int maxSum(int nums[])
	{
		int tot_score=nums[0];
		int curr_score=nums[0];
		int strt_index=0;
		int end_index=0;
		if(nums.length==0) return 0;
		for(int i =1;i<nums.length;i++)
		{
			curr_score=Math.max(nums[i], curr_score+nums[i]);
			if(curr_score==nums[i] && nums[i]>0) strt_index=i;
			tot_score=Math.max(tot_score, curr_score);
			if(tot_score==curr_score) 
				
			end_index=i;
			
		}
		System.out.println("start"+strt_index+"end index"+end_index);
		
//int a[]=		Arrays.copyOfRange(nums, strt_index, end_index+1);
	/*	for(int y=0;y<a.length;y++)
		{
			System.out.print(a[y] + " ");
		}*/
		System.out.println();
		return tot_score;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[]={3,2,-8,4,-3,1};
		int a =maxSum(nums);
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer();
		
		sb.append('N');
		sb.append('I');
	//	sb1=sb.reverse();
		
		StringBuffer sb1 = new StringBuffer(sb.reverse());
		sb.append('T');
		sb.append(sb1);
		System.out.println(sb);
		
		
	}

}
