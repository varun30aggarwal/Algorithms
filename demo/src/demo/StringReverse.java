package demo;

public class StringReverse {

	
	 public static String reverseString(String s) {
	        
		 StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < s.length(); i++) 
	        	sb.insert(0, s.charAt(i));
	        return sb.toString();
	             // return s11;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String f= reverseString("Hello");
		System.out.println(f);
		
	}

}
