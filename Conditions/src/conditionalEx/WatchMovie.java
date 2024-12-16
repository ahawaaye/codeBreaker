/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalEx;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
    	
    	
    	int moviePrice = 12;
    	  int movieRating = 5;
    	
    	  if (moviePrice >= 12 && movieRating == 5)
    	  {
			System.out.println("watch movie");
		} else { 
           System.out.println("you cannot watch the movie");
		}
        System.out.print("Enter the movie ticket price \n");
        

    }
}
