package chapter4;

import java.util.Scanner;

/* LOOP Break
 * Search a String to determine if it contains letter 'A'
 */
public class LetterSearch {

    public static void main( String args[]){

        //Get Text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search Text for Letter A
        for(int i=0; i<text.length();i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if(letterFound) {
            System.out.println("This Text contains the letter A.");
        }
         else{
             System.out.println("This Text does not contains the letter A.");
        }
    }
}
