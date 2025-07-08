public class BostonNumber {
    public static void main(String[] args) {
        int num = 37899
        int originalNum = num;

        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }

        num = originalNum;
        int factorSum = 0;
        int i = 2;
        while (num > 1) {
            while (num % i == 0) {
                factorSum += sumOfDigits(i);
                num /= i;
            }
            i++;
        }
        if (digitSum == factorSum) {
            System.out.println(originalNum + " is a Boston Number");
        } else {
            System.out.println(originalNum + " is NOT a Boston Number");
        }
    }

    // Helper method to compute digit sum of a number
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
