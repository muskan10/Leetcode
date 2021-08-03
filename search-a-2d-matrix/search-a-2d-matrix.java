class Solution {
    public boolean binaryS(int x, int arr[]){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return true;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==1){
            return binaryS(target, matrix[0]);
        }
        for(int i=0;i<matrix.length-1;i++){
            if(target>=matrix[i][0] && target<matrix[i+1][0]){
                int left=0;
                int right=matrix[0].length;
                return binaryS(target, matrix[i]);
            }
        }
        return binaryS(target, matrix[matrix.length-1]);
    }
}