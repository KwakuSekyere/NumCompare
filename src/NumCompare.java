import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }
        double num2 = scanner.nextDouble();
        
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            double lesserNumber = Math.min(num1, num2);
            System.out.println("The lesser number is: " + lesserNumber);
        }
    }
}
