class Solution {
        public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]= nums[nums[i]];
            //System.out.println(i+" "+arr[nums[i]]+" "+nums[i]);
        }
        return arr;
    }
}