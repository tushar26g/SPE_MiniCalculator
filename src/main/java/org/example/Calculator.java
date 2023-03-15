package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("1. Factorial\n2. Square root\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // do factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.sqroot(number1));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
    public double factorial(double number1) {
        double result = fact(number1);
        return result;
    }

    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }

    public double sqroot(double number1) {
        double result = Math.sqrt(number1);
        return result;
    }
}
