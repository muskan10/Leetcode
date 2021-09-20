class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> hs = new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(!hs.containsKey(nums[i])){
                hs.put(x,i);
            }
            else{
                arr[0]=hs.get(nums[i]);
                arr[1]=i;
            }
        }
        return arr;
    }
}