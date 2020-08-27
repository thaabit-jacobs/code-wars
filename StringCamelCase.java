package linked_list;

import java.util.ArrayList;
import java.util.List;

public class StringCamelCase 
{
	
	static String toCamelCase(String s)
	{
		char[] arr = s.toCharArray();
		String output = "";
		
		  List<Character> newArr = new ArrayList<>();
		  
		  for(char c: arr)
			  newArr.add(c);
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == '-' || arr[i] == '_')
			{
				int nextVal = i + 1;
				newArr.set(nextVal, Character.toUpperCase(arr[nextVal]));
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == '-' || arr[i] == '_')
			{
				newArr.set(i, ' ');
			}
		}
		
		StringBuilder sb = new StringBuilder(s);
		
		for(Character c: newArr)
		{
			output += c;
		}
		
		return output.replace(" ", "");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(toCamelCase("the-stealth-warrior"));
	}

}
