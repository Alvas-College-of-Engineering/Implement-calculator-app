package calculator;

import java.util.Scanner;

/**
 * CalculatorUI handles all user input and output display.
 */
public class CalculatorUI {

    private Calculator calculator;
    private Scanner scanner;

    // Constructor
    public CalculatorUI() {
        this.calculator = new Calculator();
        this.scanner = new Scanner(System.in);
    }

    // Display the main menu
    public void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("       JAVA CALCULATOR APPLICATION      ");
        System.out.println("========================================");
        System.out.println("  1. Addition       (+)");
        System.out.println("  2. Subtraction    (-)");
        System.out.println("  3. Multiplication (x)");
        System.out.println("  4. Division       (/)");
        System.out.println("  5. Exit");
        System.out.println("========================================");
        System.out.print("  Enter your choice (1-5): ");
    }

    // Get two numbers from user
    public double[] getInputNumbers() {
        double[] numbers = new double[2];
        System.out.print("  Enter first number  : ");
        numbers[0] = scanner.nextDouble();
        System.out.print("  Enter second number : ");
        numbers[1] = scanner.nextDouble();
        return numbers;
    }

    // Process user choice
    public void processChoice(int choice) {
        if (choice == 5) {
            System.out.println("\n  Thank you for using Java Calculator!");
            System.out.println("  Goodbye!\n");
            return;
        }

        double[] numbers = getInputNumbers();
        double a = numbers[0];
        double b = numbers[1];

        System.out.println();

        try {
            switch (choice) {
                case 1:
                    calculator.add(a, b);
                    break;
                case 2:
                    calculator.subtract(a, b);
                    break;
                case 3:
                    calculator.multiply(a, b);
                    break;
                case 4:
                    calculator.divide(a, b);
                    break;
                default:
                    System.out.println("  Invalid choice! Please enter 1-5.");
                    return;
            }
            calculator.displayResult();

        } catch (ArithmeticException e) {
            System.out.println("  " + e.getMessage());
        }
    }

    // Main application loop
    public void run() {
        int choice = 0;
        do {
            displayMenu();
            choice = scanner.nextInt();
            processChoice(choice);
        } while (choice != 5);

        scanner.close();
    }
}