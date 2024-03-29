class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(haystack == null || needle.length() > haystack.length())
         {
             return -1;
         }
        for(int i=0;i<=haystack.length()- needle.length();i++){
                int j=0;
                for(j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                }
                if(j==needle.length()){
                    return i;
                }
        }
        return -1;
    }
}