package javaExersices;

import java.util.Scanner;

public class JExersices {

     public static void main(String[] args) {
//		
//		System.out.println("hello");
//		System.out.println("Hawa Ahmed");
		
	
//		int sum1= 74;
//		int sum2= 36;
//		int sum= sum1+sum2;
//		System.out.println(sum);
    	 
    	
//		int  num1= 50;
//		int  num2= 3;
//		int sum = num1/num2;
//		System.out.println(sum);
		
//    	 
//	 
//		int num1 = -5;
//		int num2 = 8;
//		int num3 = 6;
//    	int sumA = num1+num2*num3;
//		System.out.println(sumA);
//		
//	   int nummer1 = 55;
//	   int nummer2 = 9;
//	   int sumB = (nummer1+nummer2)%nummer2;
//	   System.out.println(sumB);
   
	   int number1 = 20;
	   int number2 = -3;
	   int number3 = 5;
	   int number4 = 8;
	   int sumC = number1+number2*number3/number4;
	   System.out.println(sumC);
	   
	   int numd1 = 5;
	   int numd2 = 15;
	   int numd3 = 3;
	   int numd4 = 2;
	   int numd5 = 8;
	   int sumD = numd1+numd2/numd3*numd4-numd5%numd3;
	   System.out.println(sumD);
	   
			   
	    Scanner scanner = new Scanner(System.in);
	    
	    		 System.out.print("Input first number: ");
        int num1b = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2b = scanner.nextInt();

       
        int product = num1b * num2b;

        System.out.println(num1b + " x " + num2b + " = " + product);
	    		
	}

}
