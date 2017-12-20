/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radius.formula;

// Scanner is in the java.util package
import java.util.Scanner;
/**
 *
 * @author reisa
 */
public class RadiusFormula {

    /**
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
*/

 public static void main(String[] args) {
// Create a Scanner object
Scanner input = new Scanner(System.in);
double PI = 3.14159;
// Prompt the user to enter a radius
System.out.print("Enter a number for radius: ");
double radius = input.nextDouble();

 // Compute area
 double area = radius * radius * PI;

// Display results
System.out.println("The area for the circle of radius " +
radius + " is " + area);
}
}
