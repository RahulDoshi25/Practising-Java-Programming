package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String args[]){

        PhoneBill bill = new PhoneBill(123456);
        bill.setNoOfUserMinutes(1000);
        bill.printItemizedBill();
    }
}
