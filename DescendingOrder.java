package linked_list;

public class DescendingOrder 
{
	
	public static int[] getArray(int number)
	{
		String arrNumber = "" + number;
		
		char[] charArr = arrNumber.toCharArray();
		int[] numArr = new int[charArr.length];
		
		for(int i = 0; i<charArr.length; i++)
		{
			String holder = "" + charArr[i];
			numArr[i] = Integer.parseInt(holder);
		}
		
		return numArr;
	}
	
	
	public static int descendingOrder(int number)
	{
		int[] numArr = getArray(number);
		
		boolean sorted = false;
		
		int currentIter;
		
		while(!sorted)
		{
			sorted = true;
			
			for(int i = 0; i < numArr.length - 1; i++)
			{
				if(numArr[i] < numArr[i+1]) {
					currentIter = numArr[i];
					numArr[i] = numArr[i+1];
					numArr[i+1] = currentIter;
					sorted = false;
				}
			}
		}
		
		String orderNumStr = "";
		
		for(int i: numArr) 
			orderNumStr += i;

		int orderNum = Integer.parseInt(orderNumStr);
		
		return orderNum;
	}
	
	public static void main(String[] args) {
		System.out.println(descendingOrder(1));
	}
}
