public class MinMax {
    public static void main(String[] args) {
        
        int[] arr = {5, -1, 2, 10, -5, 6, 11};
        int n = arr.length;

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
