package linked_list;

public class GrassHopper 
{
	
	public static char gradeKey(int val)
	{
		if(val <= 100 && val >= 90)
			return 'A';
		else if(val < 90 && val >= 80)
			return 'B';
		else if(val < 80 && val >= 70)
			return 'C';
		else if(val < 70 && val >= 60)
			return 'D';
		else
			return 'F';
	}
	
    public static char getGrade(int s1, int s2, int s3) 
    {
    	int avg = (s1 + s2 + s3)/3;
    	
        return gradeKey(avg);
    }
    
	public static void main(String[] args) {
			System.out.println(getGrade(44, 55, 52));
	}

}
