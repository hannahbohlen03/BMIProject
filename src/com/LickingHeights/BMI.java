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

        //Initializing
        greeting = "Hello!";
        System.out.println(greeting + " What is your name?");
        userName = keyboard.nextLine();
        System.out.println("Nice to meet you, " + userName + ". How tall are you, in inches?");
        inches = keyboard.nextInt();
        m = inches *(0.254/1);
        System.out.println("And how much do you weight, in pounds?");
        lbs = keyboard.nextInt();
        kg = lbs *(2.205);
        System.out.println("Okay, let me calculate your BMI...");



    }
}
