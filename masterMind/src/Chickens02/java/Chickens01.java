
package Chickens02.java;

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
    	int eggsPerChicken=5;
        int chicken=8;
        int totalEggs =0;
        totalEggs+=eggsPerChicken*chicken;
        chicken++;
        
        totalEggs+=eggsPerChicken*chicken;
        chicken/=2;
        totalEggs+=eggsPerChicken*chicken;
        
        
        
        
        System.out.println(totalEggs);
        
      
        
        
   
    }   
}
