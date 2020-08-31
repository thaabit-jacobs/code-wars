package linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Clerk {
	
	  public static String Tickets(int[] peopleInLine)
	  {
		   Map<String, Integer> register = new HashMap<>();
		   
			register.put("25", 0);
			register.put("50", 0);
			register.put("100", 0);
		  
	        for(int i = 0; i < peopleInLine.length; i++)
	        {
	        	if(Integer.valueOf(peopleInLine[i]).toString().equals("25"))
	        	{
	        		int current25 = register.get("25");
	        		register.put("25", ++current25);
	        		
	        		continue;
	        	}
	        	
	        	else if(Integer.valueOf(peopleInLine[i]).toString().equals("50"))
	        	{
	        		if(register.get("25") > 0)
	        		{
		        		int current25 = register.get("25");
		        		register.put("25", --current25);
		        		
		        		int current50 = register.get("50");
		        		register.put("50", ++current50);
		        		
		        		continue;
	        		} else
	        		{
	        			return "NO";
	        		}
	        			
	        	} else if(Integer.valueOf(peopleInLine[i]).toString().equals("100"))
	        	{
	        		if((register.get("50") >= 1 && register.get("25") >= 1))
	        		{
	        			int current50 = register.get("50");
		        		register.put("50", --current50);
		        		
		        		int current25 = register.get("25");
		        		register.put("25", --current25);
		        		
		        		int current100 = register.get("100");
		        		register.put("100", ++current100);
		        		
		        		continue;
	        		}
	        		else if(register.get("25") >= 3)
	        		{
		        		int current25 = register.get("25");
		        		register.put("25", current25 - 3);
		        		
		        		int current100 = register.get("100");
		        		register.put("100", ++current100);
		        		
		        		continue;
	        		}
	        		else
	        		{
	        			return "NO";
	        		}
	        	}
	        }
			
	        return "YES";
	  }
	  
	  
	public static void main(String[] args) {
		System.out.println(Tickets(new int[] {25, 25, 50}));
		System.out.println(Tickets(new int[] {25, 100}));
		//System.out.println(new int[] {25, 25, 50});
	}

}
