package linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakCamelCase 
{
	
	  public static String camelCase(String input) {
		  char[] arr = input.toCharArray();
		  List<Character> newArr = new ArrayList<>();
		  
		  for(char c: arr)
			  newArr.add(c);
		  
		  int count = -1;
		  
		  for(int i = 0; i<arr.length; i++) {
			  if(Character.isUpperCase(arr[i]))
			  {
				  count++;
				 newArr.add(i + count ,' ');
			  }
		  }
		  
		  String output = "";
		  
		  for(Character c: newArr)
			  output += c;
		  
		  return output;
	  }
	
	public static void main(String[] args)
	{
		System.out.println(camelCase("camelcasingtest"));
	}
}
