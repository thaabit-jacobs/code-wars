package linked_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Greed{
	  public static int greedy(int[] dice){
	    String[] arr = new String[dice.length];
	    Map<String, Integer> map = new HashMap<>();
	    
	    int currentVal;
	    int score = 0;
	    
	    map.put("1",0);
	    map.put("2",0);
	    map.put("3",0);
	    map.put("4",0);
	    map.put("5",0);
	    map.put("6",0);
	    
	    for(int i = 0; i<arr.length; i++)
	    	arr[i] = "" + dice[i];
	    
	    for(int i = 0; i < arr.length; i++)
	    	switch(arr[i])
	    	{
	    		case "1":
	    			currentVal = map.get("1");
	    			map.put("1", ++currentVal);
	    			break;
	    		case "2":
	    			currentVal = map.get("2");
	    			map.put("2", ++currentVal);
	    			break;
	    		case "3":
	    			currentVal = map.get("3");
	    			map.put("3", ++currentVal);
	    			break;
	    		case "4":
	    			currentVal = map.get("4");
	    			map.put("4", ++currentVal);
	    			break;		
	    		case "5":
	    			currentVal = map.get("5");
	    			map.put("5", ++currentVal);
	    			break;
	    		case "6":
	    			currentVal = map.get("6");
	    			map.put("6", ++currentVal);
	    			break;
	    	}
	    
	    for(Map.Entry mapElement : map.entrySet())
	    {
	    	switch((String)mapElement.getKey())
	    	{
	    		case "1":
	    			if((Integer)mapElement.getValue() == 5)
	    				score += 1200;
	    			else if((Integer)mapElement.getValue() == 4)
	    				score += 1100;
	    			else if((Integer)mapElement.getValue() == 3)
	    				score += 1000;
	    			else if((Integer)mapElement.getValue() == 2)
	    				score += 200;
	    			else if((Integer)mapElement.getValue() == 1)
	    				score += 100;
	    			break;
	    		case "2":
	    			if((Integer)mapElement.getValue() == 5)
	    				score += 200;
	    			else if((Integer)mapElement.getValue() == 4)
	    				score += 200;
	    			else if((Integer)mapElement.getValue() == 3)
	    				score += 200;
	    			break;
	    		case "3":
	    			if((Integer)mapElement.getValue() == 5)
	    				score += 300;
	    			else if((Integer)mapElement.getValue() == 4)
	    				score += 300;
	    			else if((Integer)mapElement.getValue() == 3)
	    				score += 300;
	    			break;
	    		case "4":
	    			if((Integer)mapElement.getValue() == 5)
	    				score += 400;
	    			else if((Integer)mapElement.getValue() == 4)
	    				score += 400;
	    			else if((Integer)mapElement.getValue() == 3)
	    				score += 400;
	    			break;		
	    		case "5":
	    			if((Integer)mapElement.getValue() == 5)
	    				score += 600;
	    			else if((Integer)mapElement.getValue() == 4)
	    				score += 650;
	    			else if((Integer)mapElement.getValue() == 3)
	    				score += 600;
	    			else if((Integer)mapElement.getValue() == 2)
	    				score += 100;
	    			else if((Integer)mapElement.getValue() == 1)
	    				score += 50;
	    			break;
	    		case "6":
	    			if((Integer)mapElement.getValue() == 5)
	    				score += 600;
	    			else if((Integer)mapElement.getValue() == 4)
	    				score += 600;
	    			else if((Integer)mapElement.getValue() == 3)
	    				score += 600;
	    			break;
	    	}
	    }
	    
	    return score;
	  }
  
  public static void main(String[] args)
  {
	 System.out.println(greedy(new int[]{1, 1, 1, 1, 5}));
  }
}
