class Solution {
    public int binary(int arr[], int l, int r, int k){
        if(r<l){
            return -1;
        }
        int mid = l+(r-l)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]<k){
            return binary(arr,mid+1,r,k);
        }
        else{
            return binary(arr,l, mid-1,k);
        }
    }
    public int search(int[] nums, int target) {
        return binary(nums, 0,nums.length-1, target);
    }
}