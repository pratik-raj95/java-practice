import java.util.Scanner;

public class OddEvenRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car number: ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            temp = temp / 10;
        }

        if (evenSum % 4 == 0 || oddSum % 3 == 0) {
            System.out.println("Car number " + n + " is ALLOWED to run on Sunday.");
        } else {
            System.out.println("Car number " + n + " is NOT allowed to run on Sunday.");
        }
    }
}
