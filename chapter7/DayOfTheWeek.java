package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String args[]){

        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        boolean validatInput = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number corresponding to day of the week(1-7) where Monday is 1");
        int day = scanner.nextInt();

            //Optional where we check for invalid input entered by the user
            if (day > 7 || day < 1) {
                do{
                    System.out.println("You entered incorrect number. Please enter number from 1-7");
                    day = scanner.nextInt();
                    if(day>=1 && day <=7){
                    validatInput = false;
                    }
                }while(validatInput);
            }
            scanner.close();
        System.out.println("Day of the week corresponding to number you enter is " + week[day-1]);
    }
}
