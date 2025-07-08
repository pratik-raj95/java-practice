import java.util.Arrays;

public class Main {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
 while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // nums[mid] == 2
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--; // mid is not incremented here
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.println("Sorted: " + Arrays.toString(nums1));

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.println("Sorted: " + Arrays.toString(nums2));
    }
}
