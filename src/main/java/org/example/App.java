/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //input
        System.out.println("Enter the principal: ");
        String strPrincipal = scan.nextLine();
        System.out.println("Enter the rate of interest: ");
        String strRate = scan.nextLine();
        System.out.println("Enter the number of years: ");
        String strYears = scan.nextLine();

        //processing
        double principal = Double.parseDouble(strPrincipal);
        double rate = Double.parseDouble(strRate);
        double years = Double.parseDouble(strYears);

        double interest = rate / 100;
        double total = principal * (1+(interest * years));

        //output
        BigDecimal total1 = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        NumberFormat total2 = NumberFormat.getCurrencyInstance();

        System.out.println("After " +strYears+ " years at " +strRate+ "%, the investment will be worth " +total2.format(total1)+ ".");
    }
}
