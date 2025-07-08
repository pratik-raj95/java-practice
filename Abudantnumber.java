//write a program to check number is abudent defecient number or neatural number ?


import java.util.Scanner;

public class Abudantnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        
        if (sum == num) {
            System.out.println(num + " is a Perfect (Neutral) number.");
        } else if (sum > num) {
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is a Deficient number.");
        }
    }
}

