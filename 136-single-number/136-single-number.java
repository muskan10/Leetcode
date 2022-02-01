class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i],1);
            }
            else{
                hs.put(nums[i],hs.get(nums[i])+1);
            }
        }
        for (Map.Entry<Integer, Integer> n : hs.entrySet()){
            if((Integer)n.getValue()==1){
                return (Integer)n.getKey();
            }
        }
        return -1;
    }
}