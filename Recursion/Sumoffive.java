package Recursion;

public class Sumoffive {

    public static void main(String[] args) {
        System.out.println(Sum(5)); // This will print: 15
    }

    public static int Sum(int n) {
        if (n == 1) return 1;
        int sm = Sum(n - 1);
        return n + sm;
    }
}
