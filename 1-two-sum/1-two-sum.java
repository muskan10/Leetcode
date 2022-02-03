class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int x = target-nums[i];
            if(!hs.containsKey(x)){
                hs.put(nums[i],i);
            }
            else{
                //System.out.println(hs.get(x));
                arr[0]=hs.get(x);
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}