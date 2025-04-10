package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Step 1

        int number1 = 15;
        int number2 = 25;
        int sum = number1 + number2;
        System.out.println("Question 1: What is " + number1 + " + " + number2 + "?");

        System.out.println("The answer is " + sum);

        int number3 = 22;
        int number4 = 4;
        int difference = 22 - 4;
        System.out.println("Question 2: If you subtract " + number4 + " from " + number3 + ", what do you get?");
        System.out.println("The answer is: " + difference);
        System.out.println();

        //Step 2
        // 1. Question Find and display the highest
        int bobSalary = 45000;
        int garySalary = 65000;
             int highestSalary;
            if (bobSalary > garySalary) {
            highestSalary = bobSalary;
            System.out.println("Highest Salary is Bob's Salary " + highestSalary);
        } else {
            highestSalary = garySalary;
            System.out.println("Highest Salary is Gary's Salary " + highestSalary);
        }

        // 2. Question Find and display the smallest
        int carPrice = 33000;
        int truckPrice = 22000;
        int smallestPrice;
        if (carPrice < truckPrice) {
            smallestPrice = carPrice;
            System.out.println("Smallest Price is Car's price " + smallestPrice);
        } else {
            smallestPrice = truckPrice;
            System.out.println("Smallest Price is Truck's price " + smallestPrice);
        }

        //3. Question Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle with radius " + area);

        //4. Find and display the square root a variable after it is set to 5.0
        double num = 5.0;
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of " + num + " is:" + squareRoot);

        //5. Find and display the distance between the points (5, 10) and (85, 50)
        int x1= 5, y1 = 10;
        int x2= 85, y2 = 50;

        //Measfe formülü
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

        //6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        double number11 = -3.8;
        double absoluteValue = Math.abs(number11);
        System.out.println("The absolute value of " + number11 + " is: " + absoluteValue);

        //7. Find and display a random number between 0 and 1
        double randomValue = Math.random();
        System.out.println("A random number between 0 and 1: " + randomValue);


    }
}