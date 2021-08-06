class Solution {
    public int binary(int arr[],int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if (arr[mid] == x)
                return mid;
  
            if (arr[mid] > x)
                return binary(arr, l, mid - 1, x);
            return binary(arr, mid + 1, r, x);
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        if(nums.length==0){
            return arr;
        }
        int x = binary(nums, 0,nums.length-1, target);
        if(x!=-1){
            for(int i=x;i<nums.length;i++){
                if(nums[i]==target){
                    arr[1]=i;
                }
                else{
                    break;
                }
            }
            for(int i=x;i>=0;i--){
                if(nums[i]==target){
                    arr[0]=i;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
}