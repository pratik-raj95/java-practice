import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Size of array
        
        int arr[] = new int[n];
        
        // Taking array input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing array elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
