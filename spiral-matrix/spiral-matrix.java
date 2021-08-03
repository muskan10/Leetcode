class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int tl=0, tr=matrix[0].length, br=matrix.length, bl=0;
        //System.out.println(tl+" "+tr+" "+bl+" "+br);
        List<Integer> ar = new ArrayList<Integer>();
        int i=0;
        int rounds=matrix[0].length*matrix.length;
       while(i<rounds){
            for(int j=bl;j<tr;j++){
                ar.add(matrix[tl][j]);
                i++;
                if(i==rounds){
                   break;
                }
            }
           if(i==rounds){
                   break;
                }
            tl++;
            for(int j=tl;j<br;j++){
                ar.add(matrix[j][tr-1]);
                i++;
                if(i==rounds){
                   break;
                }
            }
           if(i==rounds){
                   break;
                }
            tr--;
            for(int j=tr-1;j>=bl;j--){
                ar.add(matrix[br-1][j]);
                i++;
                if(i==rounds){
                   break;
                }
            }
           if(i==rounds){
                   break;
                }
            br--;
            for(int j=br-1;j>=tl;j--){
                ar.add(matrix[j][bl]);
                i++;
                if(i==rounds){
                   break;
                }
            }
           if(i==rounds){
                   break;
                }
            bl++;
        }
        return ar;
    }
}