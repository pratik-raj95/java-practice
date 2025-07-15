public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int n = arr.length;

        // Swap elements from start and end moving towards center
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // Print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
