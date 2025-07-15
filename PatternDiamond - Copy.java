import java.util.Scanner;

public class PatternDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number (1-9): ");
        int n = sc.nextInt();

        if (n <= 0 || n >= 10 || n % 2 == 0) {
            System.out.println("Invalid input! Please enter an odd number between 1 and 9.");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' if:
                if (i == 0 || i == n - 1) {
                    // First and last rows – all stars
                    System.out.print("*\t");
                } else if (j == 0 || j == n - 1) {
                    // First and last column – stars
                    System.out.print("*\t");
                } else if (i == j || j == n - i - 1) {
                    // Diagonals
                    System.out.print("*\t");
                } else {
                    // Else print tab space
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
