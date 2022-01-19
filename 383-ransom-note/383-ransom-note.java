class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int brr[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            brr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(brr[ransomNote.charAt(i)-'a']>0){
                brr[ransomNote.charAt(i)-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}