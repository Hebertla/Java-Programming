/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumformula;

///import java.util.Scanner;

/**
 *
 * @author reisa
 */
///public class SumFormula {

    /**
     * @param args the command line arguments
     */
     

///public static void main(String[] args) {
// Create a Scanner object
///Scanner input = new Scanner(System.in);
///double PI = 3.14159;
// Prompt the user to enter a radius
///System.out.print("Enter 5-digit positive integer: ");
///double numbers = input.nextDouble();

 // Compute area
 ///double area = numbers * numbers * PI;

// Display results
///System.out.println("The area for the circle of radius " +
///numbers + " is " + area);
///}
///}


import java.util.Scanner; // Scanner is in the java.util package

public class SumFormula {


/**
 *
 * @author reisa
 */

    /**
     * @param args the command line arguments
     */   
        
        // TODO code application logic here
        
        private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Reminder, Sum = 0;
		sc = new Scanner(System.in);		
		System.out.println("Enter 5-digit positive integer: ");
		Number = sc.nextInt();
		
                while(Number > 0 ) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
                //System.out.println("The sum of all digits in " + Number + " is " + Sum);
		System.out.format("Sum of the digits is = %d", Sum);
	}
}      