package dynamicprogramming;



/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * 
 * 
 * 
 */

import java.util.HashMap;



public class LongestSubString {

	public static int lengthOfLongestSubstring(String s) {
		int max=0;
		
		HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
		
		for(int i =0,j=0;i<s.length();++i)
		{
			if(mp.containsKey(s.charAt(i)))
			{
				j=Math.max(j, mp.get(s.charAt(i))+1);
			}
			
				mp.put(s.charAt(i), i);
			
			max=Math.max(max,i-j+1);
		}
		
		
		
		
		return max;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="pwwkew";
     int a = lengthOfLongestSubstring(s);
     System.out.println(a);
		
		
		
	}

}
