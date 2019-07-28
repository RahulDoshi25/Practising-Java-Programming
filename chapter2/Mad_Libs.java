package chapter2;

import java.util.Scanner;

public class Mad_Libs {

    public static void main(String args[]){
        //1. Get Season of the Year
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Get Whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        //3. Get Adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        //4. Display Result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
