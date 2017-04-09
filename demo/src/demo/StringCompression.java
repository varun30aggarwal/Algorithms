package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g="aabcccccaaa";
		int count=1;
	StringBuffer str=new StringBuffer();
		char last=g.charAt(0);
		for(int i=1;i<g.length();i++)
		{
			if(g.charAt(i)==last)
			{
				count++;
				
				
			}
			else
			{
			
				str.append(last);
				str.append(count);
				last=g.charAt(i);
				count=1;
			}
		}
		
		str.append(last);
		str.append(count);
		String newstring=str.toString();
		System.out.println(newstring);
}
}