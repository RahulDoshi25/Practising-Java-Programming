package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP
 * Each Store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidation {

    public static void main(String args[]){

        //Initialize the known variables
        int rate = 15;
        int maxHours = 40;

        //Get the input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate Input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid Entry. Yours hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate Gross
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay is : $" + gross);
    }

}
