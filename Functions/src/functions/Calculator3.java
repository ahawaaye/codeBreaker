package functions;

public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    
    public void FindTotal(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);

    }
}
