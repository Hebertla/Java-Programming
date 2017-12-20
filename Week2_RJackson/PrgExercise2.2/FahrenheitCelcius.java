/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheit.celcius;


   import java.util.Scanner;
/**
 *
 * @author reisa
 */
public class FahrenheitCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    

Scanner input = new Scanner(System.in);

System.out.print("Enter a degree in Fahrenheit: ");

double fahrenheit = input.nextDouble();

// Convert Fahrenheit to Celsius
double celsius = (5.0 / 9) * (fahrenheit - 32);

System.out.println("Fahrenheit " + fahrenheit + " is " +
        
celsius + " in Celsius");
/////////

System.out.print("Enter a degree in Celsius: ");

double celsius1 = input.nextDouble();

// Convert Fahrenheit to Celsius
double fahrenheit1 = celsius1 * (9.0 / 5) + 32;

System.out.println("Celsius " + celsius1 + " is " +
        
fahrenheit1 + " in Fahrenheit");
    
    }
    
}
