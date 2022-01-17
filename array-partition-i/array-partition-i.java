class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;  
        
        Arrays.sort(nums);
              
        for (int i=nums.length-2; i>=0; i-=2) {
            result += nums[i];
        }
        
        return result;
    }
}