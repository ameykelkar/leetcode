public class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //  Create two auxiliary arrays
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        //  Populate the auxiliary arrays
        left[0] = 1;
        int prod = 1;
        for(int i = 1; i < left.length; i++) {
            prod *= nums[i - 1];
            left[i] = prod; 
        }
        
        right[nums.length - 1] = 1;
        prod = 1;
        for(int i = right.length - 2; i >= 0; i--) {
            prod *= nums[i + 1];
            right[i] = prod;
        }
        
        //  Create results array
        int[] result = new int[nums.length];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }
        
        return result;
    }
}