package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Google3Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(3);
		ls.add(1);
		ls.add(4);
		ls.add(1);
		ls.add(5);
		ls.add(9);
		List<Integer> al = findVal(ls);
		System.out.print(al);
	}
	
	private static List findVal(List<Integer> ls)
	{
		List<Integer> rel  = new ArrayList<Integer>();
		List<Integer> temp  = new ArrayList<Integer>();
		
		for(Integer i:ls)
		{
			if(i%3!=0)
				temp.add(i);
			else
			{
				rel.add(i);
			}
		}
		
		if(temp.size()!=0)
		{
			List<List<Integer>> al = new ArrayList<>();
			List<Integer> rl = new ArrayList<>();
			
			
			combination(al,rl,0,0,temp);
			String [] res = new String[al.size()];
			int c=0;
			for(List<Integer> l:al)
			{  StringBuffer sb = new StringBuffer();
				for(int j:l){
				  sb.append(j);
				}
				res[c++]=sb.toString();
			}
			
			int max =-999;
			for(int j=0;j<res.length;j++)
			{
				max=Math.max(max, Integer.parseInt(res[j]));
			}
			System.out.println(max);
			
			while(max!=0)
			{
				rel.add(max%10);
				max=max/10;
			}
			
		}
		else
		{
			rel.addAll(ls);
			
		}
		Collections.sort(rel, Collections.reverseOrder());
		return rel;
	}

	
	private static void combination(List<List<Integer>> al, List<Integer>rl, int start,int target,List<Integer> input)
	{
		
		if(target!=0 && target%3==0)
		{
			al.add(new ArrayList<>(rl));
		}
		
		
		for(int i=start;i<input.size();i++)
		{
			rl.add(input.get(i));
			combination(al,rl,i+1,target+input.get(i),input);
			rl.remove(rl.size()-1);
		}
		
		
		
		
		
	}
	
}
