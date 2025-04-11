package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Choose your size of the sandwich : ");
        System.out.println(" 1. Regular: base price $5.45 ");
        System.out.println(" 2. Large: base price $8.95 ");
        Integer sandwichSize = input.nextInt();
        double price = 0.0;
        if (sandwichSize==1) { price = 5.45; } else if (sandwichSize==2)
        { price = 8.95; }

        System.out.println(" Enter your age : ");
        Integer age = input.nextInt();

        if (age<=17) { price *=0.90; } else if (age>=65) { price *=0.80; }

        System.out.printf("Total cost: $%.2f ", price);
        }

    }

