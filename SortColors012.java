import java.util.*;

public class SortColors012 {
        public static void sortZeroOneTwo(int[] nums) {
        // we can use pointers to track 0, 1 and 2
        int n = nums.length;

        // i will point to last zero from start
        // currently no zeros known
        int i=-1;
        // j will itereate the array and point to last one
        int j=0;
        // k will point to the first two
        // cuurently no two's known
        int k=n;

        while(j<k){
            if(nums[j]==0){
                // if element is zero then put it in front of last zero, and increment i and j
                int temp = nums[j];
                nums[j] = nums[i+1];
                nums[i+1] = temp;
                i++;
                j++;
            } else if(nums[j] ==1 ){
                // one is in correct poisition
                j++;
            } else if (nums[j]==2) {
                // if element is 2 then put it behind the first two, and decrement k
                int temp = nums[j];
                nums[j] = nums[k-1];
                nums[k-1] = temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortZeroOneTwo(nums);
        System.out.println(Arrays.toString(nums));
    }
}