package chapter4;

import java.util.Scanner;

/*
 * DO WHILE LOOP
 * Write a program that allows the user to enter 2 numbers.
 * and then sums up the two numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        boolean again = false;
        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("ENter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is : " + sum);

            System.out.println("Would you like to start again");
            again = scanner.nextBoolean();
        }while(again);
    }
}
