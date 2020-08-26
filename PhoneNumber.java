package linked_list;

public class PhoneNumber 
{
	public static String phoneNumber(int[] number)
	{
		String phoneNumStr = "";
		
		for(int val:number)
			phoneNumStr += val;
		
		StringBuilder completedPhoneNumber = new StringBuilder(phoneNumStr);
		
		completedPhoneNumber.insert(0, '(').insert(4, ')').insert(5, " ").insert(9,  "-");
		
		return completedPhoneNumber.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(phoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	}
}
