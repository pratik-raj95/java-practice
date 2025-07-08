public class Gizvirtical {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {9, 8, 7, 6},
            {4, 5, 7, 8}
        };

        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); 
        }
    }
}
