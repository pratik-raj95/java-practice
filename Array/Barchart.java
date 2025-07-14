package Array;
import java.io.*;
import java.util.*;

public class Barchart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input array size
        int n = scn.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Find the max height
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print bar chart
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println(); // move to next line
        }

        scn.close(); // Always good to close the scanner
    }
}
