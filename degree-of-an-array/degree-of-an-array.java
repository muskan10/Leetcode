class Solution {
    public int findShortestSubArray(int[] nums) {
        int max=Integer.MIN_VALUE, value=0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> ar = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i],1);
                if(max<1){
                    max=1;
                }
                ArrayList<Integer> ar1 = new ArrayList<>();
                ar1.add(i);
                ar1.add(i);
                ar.put(nums[i],ar1);
            }
            else{
                int x = hs.get(nums[i]);
                x++;
                if(max<x){
                    value=nums[i];
                    max=x;
                }
                hs.put(nums[i],x);
                ArrayList<Integer> hs1 = ar.get(nums[i]);
                hs1.set(1,i);
                ar.put(nums[i], hs1);
            }
        }
        // System.out.println(hs);
        // System.out.println(ar);
        // System.out.println(max);
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> e: hs.entrySet()){
            if((Integer)e.getValue()==max){
                ArrayList<Integer> g = ar.get((Integer)e.getKey());
                int diff = g.get(1)-g.get(0);
                if(diff<min){
                    min = diff;
                }
            }
        }
        return min+1;
    }
}