class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ar = new ArrayList<>();
        ar.add(new ArrayList<Integer>());
        ar.get(0).add(1);
        if(numRows==1){
            return ar;
        }
        else if(numRows==2){
            ar.add(new ArrayList<Integer>());
            ar.get(1).add(1);
            ar.get(1).add(1);
            return ar;
        }
        ar.add(new ArrayList<Integer>());
        ar.get(1).add(1);
        ar.get(1).add(1);
        for(int i=2;i<numRows;i++){
            ar.add(new ArrayList<Integer>());
            ar.get(i).add(1);
            int k=i-1;
            for(int j=0;j<ar.get(k).size()-1;j++){
                ar.get(i).add(ar.get(k).get(j)+ar.get(k).get(j+1));
            }
            ar.get(i).add(1);
        }
        return ar;
    }
}