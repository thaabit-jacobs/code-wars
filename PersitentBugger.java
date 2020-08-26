package linked_list;

public class PersitentBugger 
{
	
	static int count = 0;
	
	public static long mutipleArray(int[] arr)
	{
		long product = 1;
		
		for(int val: arr)
			product *= val;
		
		return product;
	}
	
	public static String convertLongToStr(long val) {
		return Long.valueOf(val).toString();
	}
	
	public static int persistence(long num)
	{
		String numStr = convertLongToStr(num);
		
		int numStrLength = numStr.length();
		
		if(numStrLength == 1)
		{
			int currentCount = count;
			count = 0;
			return currentCount;
		}
			
		
		
		int[] arr = new int[numStr.length()];
		
		for(int i = 0; i<arr.length; i++) {
			String charVal = "";
			charVal += numStr.charAt(i);
			arr[i] = Integer.parseInt(charVal);
		}
		
		count++;
		
		return persistence(mutipleArray(arr));
		
	}
	
	public static void main(String[] args) {
		System.out.println(persistence(25));
	}
}
