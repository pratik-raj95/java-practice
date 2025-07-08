import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // e.g., 1234

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;         // Get last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            number = number / 10;            // Remove last digit 
        }

        System.out.println("Reversed number: " + reversed);
    }
}
