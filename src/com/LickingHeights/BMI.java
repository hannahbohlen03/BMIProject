package com.LickingHeights;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //Declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String userName;
        String greeting;
        int lbs;
        int inches;
        double m;
        double kg;
        double BMI;

        //Initializing + Calculating
        greeting = "Hello!";
        System.out.println(greeting + " What is your name?");
        userName = keyboard.nextLine();
        System.out.println("Nice to meet you, " + userName + ". How tall are you, in inches?");
        inches = keyboard.nextInt();
        System.out.println("And how much do you weight, in pounds?");
        lbs = keyboard.nextInt();
        System.out.println("Okay, let me calculate your BMI...");

        m = inches /(39.37);
        kg = lbs /(2.205);
        BMI = kg/(m*m);

        //Print
        System.out.println(" ");
        System.out.println("Your BMI is " + BMI + ".");
        System.out.println("For a reference, if your BMI is less than 18.5, you are considered underweight.");
        System.out.println("If your BMI is between 18.5 and 24.9, then you are considered in the normal range.");
        System.out.println("If your BMI is between 25 and 29.9, you are considered over weight.");
        System.out.println("And if your BMI is over 30, you may be obese.");



    }
}
