package functions;

public class CalculatorTest4 {
    public static void main(String[] args) {
       
        Calculator4 calc = new Calculator4();
           
       
        //Name your friends
        double totalTable= calc.findTotal(10, null);
        totalTable+= calc.findTotal(12, null);
        totalTable+= calc.findTotal(9,  null);
        totalTable+= calc.findTotal(8,  null);
        totalTable+= calc.findTotal(7,  null);
        totalTable+= calc.findTotal(15, "Alex");
        totalTable +=  calc.findTotal(11, null);
        totalTable+=calc.findTotal(30, "Forgetful");
         
        System.out.println(totalTable);
     

        //Find and print the entire table's total, including tax and tip
       
    } 
}
