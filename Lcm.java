// write a prigram in java to find LCM of two number ?
import java.util.Scanner;

public class Lcm {
    // Method to calculate GCD
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcdValue = gcd(num1, num2);
        int lcm = (num1 * num2) / gcdValue;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
