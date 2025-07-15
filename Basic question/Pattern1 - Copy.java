public class Pattern1 {
    public static void main(String[] args) {
        int i = 1, rows = 5;

        while (i <= rows) {
            int space = rows - i;
            int j = 1;

            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int k = 1;
            while (k <= 2 * i - 1) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
