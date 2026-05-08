package calculator;

/**
 * Calculator class that performs basic arithmetic operations.
 */
public class Calculator {

    private double result;
    private String operationHistory;

    // Default constructor
    public Calculator() {
        this.result = 0.0;
        this.operationHistory = "";
    }

    // Parameterized constructor
    public Calculator(double initialValue) {
        this.result = initialValue;
        this.operationHistory = "Initial value: " + initialValue;
    }

    // ============ ARITHMETIC OPERATIONS ============

    public double add(double a, double b) {
        result = a + b;
        operationHistory = a + " + " + b + " = " + result;
        return result;
    }

    public double subtract(double a, double b) {
        result = a - b;
        operationHistory = a + " - " + b + " = " + result;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        operationHistory = a + " x " + b + " = " + result;
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed!");
        }
        result = a / b;
        operationHistory = a + " / " + b + " = " + result;
        return result;
    }

    // ============ GETTERS ============

    public double getResult() {
        return result;
    }

    public String getOperationHistory() {
        return operationHistory;
    }

    public void displayResult() {
        System.out.println("  >> " + operationHistory);
    }
}