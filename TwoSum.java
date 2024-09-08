import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // create a hashmap to store occuring elements
        HashMap<Integer, Integer> hm = new HashMap<>();

        //  create an answer array 
        int[] ans = new int[2];

        // iterate over the input array
        for(int i=0; i<nums.length; i++){
            int currentItem = nums[i];
            int diff = target - currentItem;
            
            // check if hashmap already has the difference required
            if(hm.containsKey(diff)){
                ans[0] = hm.get(diff);
                ans[1] = i;
                break;
            } 
            
            // add the key to hashmap if does not exist already 
            if(!hm.containsKey(currentItem)) {
                hm.put(currentItem , i);
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println("This is the answer [" + ans[0] + ", "
                + ans[1] + "]");

    }

}