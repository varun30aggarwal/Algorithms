package stack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackBracket {
public static boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
      int a =s.length();
      
      if(a%2!=0) return false;
      else
      {
          for(int i=a-1;i>=a/2;--i)
          {
              st.push(s.charAt(i));
          }
          
       //   while(!st.isEmpty())
         // {
              for(int j =a/2-1;j>=0;--j)
              {
                  if((s.charAt(j)=='('&& st.peek()==')')||(s.charAt(j)=='['&& st.peek()==']')||(s.charAt(j)=='{'&& st.peek()=='}'))
                  {
                      st.pop();
                     
                  }
              }
        //  }
           if(st.isEmpty())
                      {
                          return true;
                      }
      }
        
        return false;
    }
    public static void main(String[] args) {
    	Boolean b = isValid("({[]})");
    	System.out.println(b);
    	/* Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            Stack<Character> sc = new Stack<Character>();
            boolean result=true;
            for(char c: s.toCharArray())
                {
                
                if((c=='[')||(c=='{')||(c=='('))
                 {   sc.push(c);
                 }                
               else
               {if(sc.empty())
                    {
                    result=false;
                }
               
                else{if(c=='}' && sc.pop()!='{')
                {result=false;}
                else if(c==']' && sc.pop()!='[')
                {result=false;}
                     else if(c==')' && sc.pop()!='(')
                        { result=false;}
              
                    
                    }
                    
                    }}
           if(result && sc.empty())
                    System.out.println("YES");
                    else
                     System.out.println("NO"); 
       } */
    	
    }
}
