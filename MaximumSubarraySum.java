import java.util.*;

public class MaximumSubarraySum {
        public static int maxSubArray(int[] nums) {
        // initialize sum to 0
        int sum=0;

        // let ans be the min value
        int ans = Integer.MIN_VALUE;

        // iterate over the array
        for(int i=0; i<nums.length; i++){
            // add current number to sum 
            sum= sum+nums[i];
            ans = Math.max(ans, sum);
            // if sum less than zero , then set back to zero
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = maxSubArray(arr);
        System.out.println("Max subarray sum is: " + ans);
    }
}