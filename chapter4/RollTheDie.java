package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDie {

    public static void main(String args[]){

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i=1; i<= maxRolls; i++) {
            //System.out.println("This is your #" + (i+1) + " roll out of " + maxRolls);

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.println(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == lastSpace) {
                System.out.println("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            } else if (i == maxRolls && currentSpace < lastSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately you didn't make it to all " + lastSpace + " spaces. You lose!");
            } else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }

    }
}
