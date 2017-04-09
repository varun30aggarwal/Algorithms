package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
	 Map<String, Integer> magzineMap = new HashMap<>();
	    Map<String, Integer> noteMap;
	    
	    public RansomNote(String magazine, String note) {
	        
	     String [] mag= magazine.split(" ");
	        String not[]= note.split(" ");
	        
	        for(String str:mag)
	            {
	            if(!magzineMap.containsKey(str))
	                {
	                magzineMap.put(str,1);}
	                else
	                    {
	                    magzineMap.put(str , magzineMap.get(str)+1);
	                }
	            }
	              
	        
	        
	        for(String str1:not)
	            {
	            if(!magzineMap.containsKey(str1))
	                {
	                magzineMap.put(str1,-1);}
	                else
	                    {
	                    magzineMap.put(str1 , magzineMap.get(str1)-1);
	                }
	            }
	              
	        }


	    
	    public boolean solve() {
	        
	        for(Map.Entry<String,Integer> mp : magzineMap.entrySet())
	            {
	            if(mp.getValue()<0) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	    	
	    	  List<List<Integer>> al = new ArrayList<>();
		        List<Integer> ls = new ArrayList<>();
		        ls.add(1);
		        al.add(0,new ArrayList<>(ls));
		        ls.clear();
		        ls.add(2);
		        al.add(0,new ArrayList<>(ls));
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();
	        
	        // Eat whitespace to beginning of next line
	        scanner.nextLine();
	        
	        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
	        scanner.close();
	        
	      
	        
	        
	        boolean answer = s.solve();
	        if(answer)
	            System.out.println("Yes");
	        else System.out.println("No");
	      
	    }
}
