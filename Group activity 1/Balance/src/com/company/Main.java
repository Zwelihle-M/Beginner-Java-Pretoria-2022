package com.company;
import java.util.*;

 class Balance {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int generatedBalances[] = new int[2];
        Random r = new Random();
        generatedBalances[0] = r.nextInt(100) + 1;
        generatedBalances[1] = r.nextInt(1000) + 1;
        System.out.println("1. Display checking account balance");
        System.out.println("2. Display savings account balance");
        System.out.print("Your choice: ");
        int choice = keyboard.nextInt();


        if (choice == 1) {
            if (generatedBalances[0] < 10) {
                System.out.println("Checking account balance is low");
            } else {
                System.out.println("Checking account balance is " + generatedBalances[0]);
            }
        } else {
            if (generatedBalances[1] < 100) {
                System.out.println("Savings account balance is low");
            } else {
                System.out.println("Savings account balance is  R" + generatedBalances[1]);
            }
        }


        keyboard.close();
    }
}
