import java.util.Scanner;

public class BinarySearch {

    
    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid; 
            } else if (arr[mid] < key) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return -1; 
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

       
        int result = binarySearch(arr, key);

        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
