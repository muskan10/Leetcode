class Solution {
    public void setZeroes(int[][] matrix) {
        boolean ind=false;
        int ans[][]=new int[matrix.length][matrix[0].length];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==0){
                   for(int k=0;k<matrix[i].length;k++){
                       if(matrix[i][k]!=0)
                        ans[i][k]=-1;
                   }
                   for(int k=0;k<matrix.length;k++){
                       if(matrix[k][j]!=0)
                       ans[k][j]=-1;
                   }
               }
           }
       }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                //System.out.print(matrix[i][j]+" ");
                if(ans[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
            //System.out.println();
        }
    }
}