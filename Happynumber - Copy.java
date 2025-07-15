public class Happynumber {
    public static void main(String[] args) {
        int n = 19;
        int temp = 0; // ✅ Declare temp before using it

        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            int current = n; // Create a copy so that original `n` isn't permanently changed

            while (current > 0) {
                int ld = current % 10;
                sum += (ld * ld);
                current = current / 10;
            }

            n = sum;

            if (n == 1) {
                temp = 1; // ✅ Assign temp
                break;
            }
        }

        System.out.println(temp == 1 ? "oye happy hai 😊" : "mein har gya 😞");
    }
}
