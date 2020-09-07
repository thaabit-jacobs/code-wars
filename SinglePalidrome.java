package linked_list;

class Solutions
{
	
	public static boolean isPalindrome(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		
		sb.reverse();
		
		return s.equals(sb.toString());
	}
	
	
    public static String solve(String s)
    {
    	if(isPalindrome(s))
    		return "OK";
    	
    	for(int i = 0; i < s.length(); i++)
    	{
    		StringBuilder sb = new StringBuilder(s);
    		sb.deleteCharAt(i);
    		
    		if(isPalindrome(sb.toString()))
    			return "remove one";
    	}
    	
        return "not possible";    
    }
    
    public static void main(String[] args)
    {
    	System.out.println(solve("abba"));
    	System.out.println(solve("abbaa"));
    	System.out.println(solve("abbaab"));
    	System.out.println(solve("madmam"));
    	System.out.println(solve("raydarm"));
    }
}