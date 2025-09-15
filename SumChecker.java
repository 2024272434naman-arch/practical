
import java.util.Scanner;
public class SumChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        if (sum >= 45) {
            System.out.println("The sum is exactly 45.");
        } else  {
            int difference = num1 - num2 - num3;
            System.out.println("The sum is less than 45. Difference: " + difference);
        } 
        
    }
}
