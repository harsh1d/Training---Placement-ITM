package day1.task1;

public class task1 {
    public static void main(String[] args) {
        // allow user to select add operation
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter operation (add or demo): ");
        String op = sc.nextLine().trim();
        if (op.equalsIgnoreCase("add")) {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            System.out.println("Addition: " + a + " + " + b + " = " + add(a, b));
        } else {
            // Arithmetic Operations demo
            int num1 = 20;
            int num2 = 10;
            // Addition
            int add = num1 + num2;
            System.out.println("Addition: " + num1 + " + " + num2 + " = " + add);
            // Subtraction
            int sub = num1 - num2;
            System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + sub);
            // Multiplication
            int multiply = num1 * num2;
            System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiply);
            // Division
            int divide = num1 / num2;
            System.out.println("Division: " + num1 + " / " + num2 + " = " + divide);
            // Modulus (Remainder)
            int modulus = num1 % num2;
            System.out.println("Modulus: " + num1 + " % " + num2 + " = " + modulus);
        }
        sc.close();
    }

    // add method
    public static int add(int x, int y) {
        return x + y;
    }
}
