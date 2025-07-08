public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 5},
            {7, 3},
            {60, 5}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println("Richest Customer Wealth: " + maxWealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
