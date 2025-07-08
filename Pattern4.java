public class Pattern4 {
    public static void main(String[] args) {
        int i = 1, rows = 5;

        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
