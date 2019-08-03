package chapter7;

import java.util.Arrays;
import java.util.Random;

public class SearchingArrays {

    private static final int LENGTH = 6;  // Constant Variable
    private static final int MAX_TICKET_NUMBER = 69;  // Constant Variable

    public static void main(String args[]) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNo;
            /*
             * Generate random number then search to make sure it doesn't already exist in the array.
             * It it does, then regenerate and search again.
             */
            do{
                randomNo = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket,randomNo));
        // Number is unique if we get here. Add it to the array.
            ticket[i] = randomNo;
        }
        return ticket;
    }

    /**
     * This does a Sequential search on an array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array,int numberToSearchFor){

        /*
        This is called an Enhanced loop
        It iterates through 'array' and
        each time assigns the current element to 'value'
         */
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
        If we've reached this point, then the entire array was searched
        and the value was not found
         */
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSEarchFor){

        //Array must be sorted
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSEarchFor);
        if(index >= 0){
            return true;
        }
        else return false;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH;i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
