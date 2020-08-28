package linked_list;

public class SumOfArrays {
	
	public static int sum(int[] arr)
	{
		int total = 0;
		
		for(int i: arr)
			total += i;
		
		return total;
	}
	
	  public static int arrayPlusArray(int[] arr1, int[] arr2) {
		    return sum(arr1) + sum(arr2);
		  }
	  
	  public static void main(String[] args)
	  {
		  System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
	  }
}
