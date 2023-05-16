package cal;

class BasicCalculator implements Calculator {
    @Override
    public void add(double x, double y) {
        System.out.println("Sum: " + (x + y));
    }

    @Override
    public void subtract(double x, double y) {
        System.out.println("Difference: " + (x - y));
    }

    @Override
    public void multiply(double x, double y) {
        System.out.println("Product: " + (x * y));
    }

    @Override
    public void divide(double x, double y) {
        if (y == 0) {
            System.out.println("Division by zero is not allowed!");
        } else {
            System.out.println("Quotient: " + (x / y));
        }
    }
}