package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Integer firstNumber = input.nextInt();
        System.out.println("Enter the second number: ");
        Integer secondNumber = input.nextInt();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String choice = input.next();

        Integer result = firstNumber * secondNumber;
        System.out.printf("%d * %d =%d", firstNumber, secondNumber, result);
    }
}
