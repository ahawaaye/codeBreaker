/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileLoops;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0; 
        int sum2= 9;
        
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
sum+=number;
        while (sum2 != 0) {
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
            sum2--;
            
        }

        System.out.println("The sum is " + sum);

    }
}
