import java.util.*;
public class reverseanarray {
	private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
 
    
    public static void reverse(int[] nums)
    {
        for (int low = 0, high = nums.length - 1; low < high; low++, high--) {
            swap(nums, low, high);
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
 
        reverse(nums);
        System.out.println(Arrays.toString(nums));

}
}
