package functions;

public class Calculator {
	
	public double tax = 0.05; 
	public double tip = 0.15; 
	private double originalPrice = 10.0;
	
	public void FindTotal( ) 
	{
		double Total= originalPrice*(1+tax+tip); 
    	System.out.println(Total);
	}
	

}
