class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0)
            return 0;       
        int x = 0;
        int y = 0;
        int min = nums.length+1;
        int sum = nums[0];
        while(x<nums.length && y<=y)
        {
            
            if(sum<target){
                x++;
                if(x<nums.length)
                sum+= nums[x];
            }
            else {
                min = Math.min(x-y+1, min);
                sum-=nums[y];
                y++;
                
            }
        }
        
        if(min == nums.length+1)
            return 0;
        return min;
    }
}