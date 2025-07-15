public class Swap {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};

        int temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
