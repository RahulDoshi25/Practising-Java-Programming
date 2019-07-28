package chapter3;

import java.util.Scanner;

/*
 * IF ELSE
 * All the salespeople are expected to make atleast 10 sales per week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they are short of.
 */

public class QuotaCalculator {
    public static void main(String args[]){

        // Initialize the values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision
        if(sales >= quota)
            System.out.println("Congrats! you have made your quota");

        else{
            int salesShort = quota - sales;
            System.out.println("You have not made your quota. You were " + salesShort + " sales short");
            }

    }
}
