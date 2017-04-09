package Hash;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Anagram {

	 public List<Integer> findAnagrams(String s, String p) {
	        
	        List<Integer> ls = new ArrayList<Integer>();
	        Hashtable<Character,Integer> hs = new Hashtable<Character,Integer>();
	        for(int i =0;i<p.length();i++)
	        {
	            if(!hs.containsKey(p.charAt(i)))
	            hs.put(p.charAt(i),1);
	            else
	            hs.put(p.charAt(i),hs.get(p.charAt(i)+1));
	        }
	        int b =0;
	        for(int j =0;j<s.length();j++)
	        {
	            for(int k=j;k<j+p.length();k++)
	            {
	                if(!hs.containsKey(s.charAt(k)))
	                {
	                    b=1;
	                    j=k;
	                    break;
	                }
	                else
	                {
	                    b=0;
	                }
	            }
	            if(b==0)
	            ls.add(j);
	        }
	        
	        return ls;
	        
	        
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Anagram n = new Anagram();
		
		List<Integer> ls = new ArrayList<>();
		ls= n.findAnagrams("cbaebabacd", "abc");
		for(int k:ls)
		{
			System.out.print(k+" ");
		}
	}

}
