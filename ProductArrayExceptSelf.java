import java.util.*;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int prod = 1;

        // calculate the prefix array O(n)
        for (int i=0; i<n; i++){
            if(i==0){
                prefix[i]=1;
            } else {
                prod = prod * nums[i-1];
                prefix[i]=prod;
            }
        }

        prod = 1;

        // calculate the suffix array O(n)
        for (int i = n-1 ; i>=0; i--){
            if(i == n-1){
                suffix[i]=1;
            } else {
                prod = prod * nums[i+1];
                suffix[i]=prod;
            }
        }

        // now use prefix and suffix products 
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}