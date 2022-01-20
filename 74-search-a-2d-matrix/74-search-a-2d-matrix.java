class Solution {
    public int binary(int arr[],int l, int r, int k){
        if(r<l){
            return -1;
        }
        int mid = l+(r-l)/2;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]>k){
            return binary(arr, l, mid-1,k);
        }
        return binary(arr,mid+1,r,k);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
            for(int i=0;i<matrix.length-1;i++){
                if(target>=matrix[i][0] && target<matrix[i+1][0]){
                    int x = binary(matrix[i],0,matrix[i].length-1,target);
                    if(x==-1){
                        return false;
                    }
                    return true;
                }
            }
            int x = binary(matrix[matrix.length-1],0,matrix[matrix.length-1].length-1,target);
            if(x==-1){
                return false;
            }
            return true;
    }
}