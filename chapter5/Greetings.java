package chapter5;

import java.util.Scanner;

/* OUR FIRST METHOD
 * Write a method that asks a user for their name, then greet then by their name.
 */
public class Greetings {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name){
        System.out.println("Hi there, " + name);
    }
}
