package linked_list;

public class GrassHopperSum {
	
    public static int summation(int n) {
    	int total = 0;
    	
    	for(int i = 1; i <= n; i++)
    		total += i;
    	
        return total;
    }
    
	public static void main(String[] args) {
		System.out.println(summation(8));
	}

}
