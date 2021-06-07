package Base;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution 20
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Solution {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        double tax = 1.0;
        double totalTax = 0.0;

        double orderAmount = orderInput();

        System.out.print("What is the state? ");
        String State = in.next();

        aa:

        if (State.equals("Wisconsin")) {

            System.out.print("What is the county? ");
            String county = in.next();

            if (county.equals("Eau Claire")){

                tax = tax * 0.0555;
                totalTax = orderAmount * tax;
                orderAmount = orderAmount + totalTax;

            }

            else if (county.equals("Dane")){

                tax = tax * 0.0554;
                totalTax = orderAmount * tax;
                orderAmount = orderAmount + totalTax;

            }
        }

        else if (State.equals("Illinois")) {

            tax = tax * 0.08;
            totalTax = orderAmount * tax;
            orderAmount = orderAmount + totalTax;

        }

        else{

            break aa;

        }

        double roundTax = totalTax * 1000.0;
        int ceilTax = (int) Math.ceil(roundTax);
        double finalTax = ceilTax / 1000.0;

        double orderRound = orderAmount * 1000.0;
        int roundCost = (int) Math.ceil(orderRound);
        double costFinal = roundCost / 1000.0;

        DecimalFormat format = new DecimalFormat("0.00");
        DecimalFormat format2 = new DecimalFormat("0.00");

        System.out.print("The tax is $" +format.format(finalTax)+ ".\n\rThe total is $"+format2.format(costFinal)+".");

    }

    private static int orderInput() {

        System.out.print("What is the order amount? ");
        int orderInput = in.nextInt();

        return orderInput;

    }

}
