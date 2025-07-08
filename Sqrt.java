public class Solution {

    public int Sqrt(int x) {
        if (x < 2) {
            return x;  
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
