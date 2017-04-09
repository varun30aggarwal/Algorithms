package backtracking;

public class LongestSubstringPalindrom {

    public static String longestPalindrome(String s) {
        
         if (s.isEmpty()) {
      return null;
    }
        int n =s.length();
        if(n==1) return s;
        boolean [][]mat = new boolean[n][n];
        int start=0;
        int max=1;
        for(int i=0;i<n;i++)
        {
            mat[i][i]=true;
        }
        
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                mat[i][i+1]=true;
                start=i;
                max=2;
            }
        }
        
        for(int curr_len=3;curr_len<=n;curr_len++)
        {
            for(int i=0;i<n-curr_len+1;i++)
            {
               int j=i+curr_len-1;
                
                if((s.charAt(i)==s.charAt(j))&& mat[i+1][j-1])
                {
                    mat[i][j]=true;
                    start=i;
                    max=curr_len;
                }
            }
        }
        System.out.println(start);
           System.out.println(max);
        return s.substring(start,max+start);
        
        
        
    }
    
    
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a =longestPalindrome("bu");
System.out.println(a);
	}

}
