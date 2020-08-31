package linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmileyFaces {
	
	  public static int countSmileys(List<String> arr) {
	      if(arr.size() == 0)
	    	  return 0;
	      
	      int counter = 0;
	      
	      for(int i = 0; i < arr.size(); i++)
	    	  {
	    	  String currentString = arr.get(i);
	    	  
	    	  if(arr.get(i).length() == 2)
	    	  {
	    	  	if(currentString.charAt(0) == ':' || currentString.charAt(0) == ';')
	    	  		if(currentString.charAt(1) == ')' || currentString.charAt(1) == 'D')
	    	  			counter++;
	    	  }
	    	  else if(arr.get(i).length() == 3)
	    	  {
	    	  	if(currentString.charAt(0) == ':' || currentString.charAt(0) == ';')
	    	  		if(currentString.charAt(1) == '-' || currentString.charAt(1) == '~')
	    	  			if(currentString.charAt(2) == ')' || currentString.charAt(2) == 'D')
	    	  				counter++;
	    	  }
	    	  else
	    		  continue;
	    	  	}
	      
	      return counter;
	  }
	  
	  
	public static void main(String[] args) {
        List<String> a =  new ArrayList<String>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
		System.out.println(countSmileys(a));
		
		System.out.println();
		//System.out.println(new int[] {25, 25, 50});
	}

}
