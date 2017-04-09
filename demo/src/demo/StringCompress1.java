package demo;

import java.util.Scanner;

public class StringCompress1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner in =new Scanner(System.in);
	        String v=in.next();
	        StringBuffer s=new StringBuffer();
	      //  System.out.println(v);
	       int count=1;
	       char c[]=v.toCharArray();
	      char last=c[0];
	       for(int i=0;i<v.length();i++)
	       { if(i<v.length()-1)
	       {
	    	if(c[i]==c[i+1])
	    	{
	    		count++;
	    		
	    	}
	    	else
	    	{
	    		if(c[i-1]==c[i])
	    		{
	    		s.append(c[i+1]);
	    		}
	    		else
	    		{
	    			s.append(c[i]);
	    		}
	    	}
	    	
	    	if(count%2==0)
    		{
    			s.append("");
    			//
    			//i=i+1;
    		}
    		else
    		{
    			s.append(c[i+1]);
    		}
	    	   
	       }
	       }
	       System.out.println(s.toString());
		
	}

}
