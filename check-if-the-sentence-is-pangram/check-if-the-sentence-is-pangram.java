class Solution {
    public boolean checkIfPangram(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            if(hs.size()==26){
                return true;
            }
        }
        return false;
    }
}