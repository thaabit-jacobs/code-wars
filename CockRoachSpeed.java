package linked_list;

public class CockRoachSpeed {
	  public int cockroachSpeed(double x){
		    return (int)(x / 0.036);
		  }
	  
	  
	  public static void main(String[] args)
	  {
		  CockRoachSpeed c = new CockRoachSpeed();
		  System.out.println(c.cockroachSpeed(1.08));
	  }
}
