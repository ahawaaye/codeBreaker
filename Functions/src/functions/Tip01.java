package functions;

import java.util.Scanner;

public class Tip01 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        Temperatuur calc = new Temperatuur();
        
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Fahrenheit:");
                double fahrenheit = sc.nextDouble();
                double celsius = calc.FahrenheitToCelcius(fahrenheit, 0); 
                System.out.println("Temperature in Celsius: " + celsius);
                break;

            case 2:
                System.out.println("Enter temperature in Celsius:");
                double celsiusInput = sc.nextDouble();
                double kelvin = calc.CelciusToKelvin(celsiusInput); 
                System.out.println("Temperature in Kelvin: " + kelvin);
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }

        sc.close();
    	
    	
    	
    	
    	
    	
    	
        
    }    
}
