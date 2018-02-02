package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // code for personal assessment week 2 (Friday 1/19/18)
        Scanner sc = new Scanner(System.in);

        Random selectNumber = new Random();
        int selectRandom = selectNumber.nextInt(10000);
        System.out.println(selectRandom + "DISPLAYED FOR TESTING PURPOSE ONLY!!!");

        System.out.println("Please enter a number between 1 - 10,000:");
        String originalNumber = sc.nextLine();
        int originalInt = Integer.parseInt(originalNumber);

        //while (originalInt != selectRandom) {
            if (originalInt == selectRandom) {
                System.out.println("Good Job");
            } else if (originalInt > selectRandom) {
                System.out.println("LOWER");
                System.out.println("The random number is less than " + originalInt + " and > 1");
                System.out.println("Please enter another number:");
                String secondNumber = sc.nextLine();
            } else if (originalInt < selectRandom) {
                System.out.println("HIGHER");
                System.out.println("The random number is greater than " + originalInt + " and < 10,000");
                String secondNumber = sc.nextLine();
            }
            String secondNumber = sc.nextLine();
        }
    }

