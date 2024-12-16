package casting01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "dhasd83824djsd";
        
        
        int shirtPrice1 = Integer.parseInt(shirtPrice);
        double taxRate1 = Double.parseDouble(taxRate);
        //int gibberish1 = Integer.parseInt(gibberish);//
        //System.out.println(gibberish);//
        System.out.println(taxRate1);
        System.out.println(shirtPrice1*taxRate1);
        
        
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
