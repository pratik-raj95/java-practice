import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        int arr[][] = new int[rows][cols]; // Fix: initialize array with size

        // Input elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { // Fix: added space in `int j`
                arr[i][j] = sc.nextInt();
            }
        }

        // Print array
        print(arr);
    }

    public static void print(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
