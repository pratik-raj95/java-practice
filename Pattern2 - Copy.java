public class Pattern2 {
    public static void main(String[] args) {
        int i = 5;

        while (i >= 1) {
            int space = 5 - i;
            int j = 1;

            while (space > 0) {
                System.out.print(" ");
                space--;
            }
            

            int k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i--;
        }
    }
}
