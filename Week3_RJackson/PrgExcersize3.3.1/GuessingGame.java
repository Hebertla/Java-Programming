/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.game;

/**
 *
 * @author reisa

 */

      //import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

public static void main(String[] args) {
Random r = new Random();
Scanner sc = new Scanner(System.in);

int randomNumber = r.nextInt(10000) + 1;
// set the number of turn you want
int numTurns=10000;

System.out.println("Welcome to the number guessing game where you will guess a number between 1 and 10000.");
while (numTurns != 0) {
System.out.println("What is your guess?");
int ans = sc.nextInt();

if (ans > randomNumber) {
System.out.println("Too High!");
} else if (ans < randomNumber) {
System.out.println("Too Low!");
} 
// 
else {
System.out.println("You guessed my number is "+(10-numTurns+1)+" guesses!");
System.out.println("Thanks for playing the number guessing game!");
return;
}

numTurns--;
}

System.out.println("Sorry.. You lost the game!");
System.out.println("Thanks for playing the number guessing game!");

}
}
