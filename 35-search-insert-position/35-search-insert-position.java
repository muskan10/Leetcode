class Solution {
    public int binary(int l, int r, int arr[], int k){
        if(r<l){
            return l;
        }
        int mid=l+(r-l)/2;
        if(k==arr[mid]){
            return mid;
        }
        else if(k<arr[mid]){
            return binary(l,mid-1,arr,k);
        }
        else{
            return binary(mid+1,r,arr,k);
        }       
    }
    public int searchInsert(int[] nums, int target) {
        return binary(0,nums.length-1,nums,target);
    }
}