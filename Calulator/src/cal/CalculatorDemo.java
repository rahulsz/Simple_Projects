package cal;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // Taking User Input Using Scanner
        System.out.println("Enter two numbers:");
        double x = input.nextDouble();
        double y = input.nextDouble();

        BasicCalculator calculator = new BasicCalculator();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice:");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                calculator.add(x, y);
                break;
            case 2:
                calculator.subtract(x, y);
                break;
            case 3:
                calculator.multiply(x, y);
                break;
            case 4:
                calculator.divide(x, y);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
