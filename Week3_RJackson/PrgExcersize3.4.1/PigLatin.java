/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pig.latin;

/**
 *
 * @author reisa
 */

import java.util.*;
import java.io.*;

public class PigLatin {
   public static void main(String[] args) throws FileNotFoundException {
        File phrases = new File("C:\\Users\\reisa\\Desktop\\phrases.txt");
        Scanner input = new Scanner(phrases);

        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.print("\"" + line + "\"" + " in pig latin is \"");
            Scanner words = new Scanner(line);
            String pigLatin = "";
            while(words.hasNext()){
            String word = words.next();
            pigLatin += pigLatinWord(word) + " ";
                System.out.print(pigLatin + " ");
            }
            System.out.println("\"");
        }
    }


    public static String pigLatinWord(String s) {
        String pigWord;
        if (isVowel(s.charAt(0))) {
            pigWord = s + "way";
        } else if (s.startsWith("th") || s.startsWith("Th")) {      // or (s.toUpperCase().startsWith("TH"))
            pigWord = s.substring(2) + "-" + s.substring(0,2) + "ay";
        } else {
            pigWord = s.substring(1,s.length()) + "" + s.charAt(0) + "ay";
        }
        return pigWord;
    }


    public static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return (vowels.indexOf(c) >= 0);    // when index of c in vowels is not -1, c is a vowel
    }

    
}