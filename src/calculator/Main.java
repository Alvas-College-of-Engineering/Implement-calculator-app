package calculator;

/**
 * Main class - Entry point of the Calculator Application.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n  Starting Java Calculator Application...");

        CalculatorUI ui = new CalculatorUI();
        ui.run();
    }
}