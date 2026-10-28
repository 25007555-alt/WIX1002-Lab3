import java.util.Scanner;

public class Q1SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = input.nextInt();
        System.out.print("Enter the second integer: ");
        int second = input.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (first + second));
                break;
            case '-':
                System.out.println("Result: " + (first - second));
                break;
            case '*':
                System.out.println("Result: " + (first * second));
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;
            case '%':
                if (second == 0) {
                    System.out.println("Cannot find a remainder with a zero divisor.");
                } else {
                    System.out.println("Result: " + (first % second));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        input.close();
    }
}
