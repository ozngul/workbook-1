package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Step 1
        /*
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("How many hours did you work? ");
        float hours = input.nextFloat();
        System.out.print("Enter pay rate: ");
        float payRate = input.nextFloat();

        float grossPay = hours * payRate;

        System.out.printf("%nEmployee name: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
*/
        //Step 2
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("How many hours did you work? ");
        float hours = input.nextFloat();
        System.out.print("Enter pay rate: ");
        float payRate = input.nextFloat();

                if (hours>40) {
                    float grossPay =  (40 * payRate) + (hours-40) * (payRate * 1.5f);
                    System.out.printf("%nEmployee name: %s%n", name);
                    System.out.printf("Gross Pay: $%.2f%n", grossPay);
                }
                else {
                        float grossPay = ( hours * payRate);
                    System.out.printf("%nEmployee name: %s%n", name);
                    System.out.printf("Gross Pay: $%.2f%n", grossPay);
        }
    }
}
