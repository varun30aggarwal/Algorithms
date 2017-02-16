package array;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] ={4,3,2,7,8,2,3,1};
		
		 List<Integer> ls = new ArrayList<Integer>();
	       
	       Hashtable<Integer,Integer> hs = new Hashtable<Integer,Integer>();
	       int sum=0;
	       int max=-1;
	       int min =Integer.MAX_VALUE;
	       for(int i =0;i<a.length;i++)
	       { 
	           if(max<a[i]) max=a[i];
	           min=Math.min(min,a[i]);
	           if(hs.containsKey(a[i]))
	        	   {hs.put(a[i],hs.get(a[i])+1) ;}
	           else {hs.put(a[i],1);}
	        //   sum+=a[i];
	           
	       }
	       
	       for(int u =min;u<=max;u++)
	       
	       {
	           if(!hs.containsKey(u))
	           ls.add(u);
	       }
	       
	   //    return ls;
	}

}
