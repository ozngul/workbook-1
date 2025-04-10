package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter is your your order cost: ");
        double total = input.nextDouble();
        System.out.printf("Your total is: %.2f" , total);
*/
        // printf data formatini düzenler ve diğer basamakları yazmaz.

        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);
        System.out.println(name + "(id: " + id + ") $" + pay);


    }
}
