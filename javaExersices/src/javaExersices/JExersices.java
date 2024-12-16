package javaExersices;

import java.util.Scanner;

public class JExersices {

     public static void main(String[] args) {
    	 
    	 Scanner sc = new Scanner(System.in);
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
 
    	 
    	 // java exercise opdracht 32
    	 

    	int num1 =  sc.nextInt();
    	System.out.println("eerste nummer");
    	
    	int num2 = sc.nextInt();
    	System.out.println("eerste nummer");
    	
    	if(num1 == num2) {
    		System.out.println(num1 +"!=" + num2);
    	}
           if (num1 < num2 ){
        	   System.out.println(num1 +"<" + num2);
    	}
           if(num1 <= num2) {
        	   System.out.println(num1 +"<=" + num2);
           }
     
           
         // opdracht 33
           
           String userInput = sc.next();
           String digits =" ";
      
           String[]myArray=userInput.split(digits);
           int a = Integer.parseInt(myArray[0]);    
           int b = Integer.parseInt(myArray[1]);
            System.out.println(a + b );  
            
            
            // opdracht 35
            
            double polygon = 7;
            double side =6;
            double result= (polygon*side*side)/(4*tan(PI/polygon));
            System.out.println("the area is"+result);
    	 
            
            
            
            
            
            
}}
