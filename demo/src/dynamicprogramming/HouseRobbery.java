package dynamicprogramming;

/*
 * After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 * 
 * 
 */

import java.util.Arrays;

public class HouseRobbery {
	public static int rob(int[] nums) {
        int temp1=0;
        int temp2=0;
        /*
         * 
         * if taking first house then don't take last house )i=0;i<len-1)
         * else take from i =1 to i<len 
         * then take max of both cases...
         * 
         * 
         */
        if(nums.length==0) return 0;
         
             
         
        if(nums.length==1) return nums[0];
        
        if (nums.length==2) return Math.max(nums[0],nums[1]);
        
        int mem[] = Arrays.copyOf(nums, nums.length);
      
        for(int j=1;j<nums.length-1;j++)
        {
            if(j==1)
            mem[j]= Math.max(mem[j-1],mem[j]);
            
            else
            mem[j]=Math.max(mem[j-1],mem[j]+mem[j-2]);
        }
        
        for(int i =1;i<nums.length;i++)
        {
            if(i==1)
            nums[i]=nums[1];
            else if(i==2)
            nums[i]=Math.max(nums[i-1],nums[i]);
            else 
            nums[i]=Math.max(nums[i]+nums[i-2],nums[i-1]);
        }
         temp1=mem[mem.length-2];
         temp2= nums[nums.length-1];
        
        return Math.max(temp1,temp2);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int [] num ={2,1,1,1};
		
		int a = rob(num);
		System.out.println(a);
		
		
	}

}
