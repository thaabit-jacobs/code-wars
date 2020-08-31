package linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TRanslating {
	
	public static boolean checkNum(String s)
	{
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9')
				return true;
		
		return false;
	}
		
	
	   public static String translate(String str){
		   str = str.toLowerCase();
		   
		   StringBuilder  sb = new StringBuilder(str);
		   
		   if(checkNum(str))
			   return null;
		   
		     if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u')
		    	 return str + "way";
		     
		     
		    for(int i = 0; i < sb.length(); i++)
		    {
		    	if(sb.charAt(0) >= 'a' || sb.charAt(0) <= 'z')
		    	{
		    		char c = sb.charAt(0);
		    		sb.deleteCharAt(0).append(c);		
		    		
				     if(sb.charAt(0) == 'a' || sb.charAt(0) == 'e' || sb.charAt(0) == 'i' || sb.charAt(0) == 'o' || sb.charAt(0) == 'u')
				    	 return sb + "ay";
		    	}
		    }
		    
		     return str  + "ay";
		     
		   }
	  
	public static void main(String[] args) {
		System.out.println(translate("map"));
		System.out.println(translate("egg"));
		System.out.println(translate("spaghetti"));
		System.out.println(translate("aghett11i"));
	}

}
