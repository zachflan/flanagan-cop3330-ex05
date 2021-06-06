/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex05;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String numOneS = in.nextLine();
        int numOneI = Integer.parseInt(numOneS);

        Scanner in2 = new Scanner(System.in);
        System.out.print("What is the second number? ");
        String numTwoS = in2.nextLine();
        int numTwoI = Integer.parseInt(numTwoS);

        int addition = numOneI + numTwoI;
        int subtraction = numOneI - numTwoI;
        int multiplication = numOneI * numTwoI;
        int division = numOneI / numTwoI;

        String outputString = numOneS + " + " + numTwoS + " = " + addition + "\n" + numOneS + " - " + numTwoS + " = " + subtraction + "\n" + numOneS + " * " + numTwoS + " = " + multiplication + "\n" + numOneS + " / " + numTwoS + " = " + division;
        System.out.println(outputString);
    }
}