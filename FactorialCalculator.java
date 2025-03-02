import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {  
            int number = getNonNegativeInteger(scanner);
            long factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is " + factorial + "\n");
        }
    }

    public static int getNonNegativeInteger(Scanner scanner) {
        int number;
        do {
            System.out.print("Enter a non-negative integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid non-negative integer.");
                scanner.next(); 
                System.out.print("Enter a non-negative integer: ");
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } while (number < 0);
        return number;
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}