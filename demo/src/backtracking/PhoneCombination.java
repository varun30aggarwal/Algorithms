package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneCombination {

    public static List<String> letterCombinations(String digits) {
        ArrayList<String> ls = new ArrayList<>();
        char [] ch = new char[digits.length()];
        helper(digits,0,ch,ls);
        if(digits.length()==0) return new ArrayList<>();
        return ls;
    }
    
    private static void helper(String digit1, int digit, char[]ch,ArrayList<String> ls)
    {
        
        if(digit==digit1.length())
        {
            ls.add(new String(ch));
        }
        else{
        for(int i=0;i<Mapping[digit1.charAt(digit)-'0'].length();i++)
        {
            char c = Mapping[digit1.charAt(digit)-'0'].charAt(i);
            ch[digit]=c;
            helper(digit1,digit+1,ch,ls);
        }
        }
    }
    
    private static final String[] Mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void main(String[] args)
    {
    	List<String> al = new ArrayList<>();
    	al= letterCombinations("23");
    	for(String h:al)
    	{
    		System.out.println(h);
    	}
    }
}
