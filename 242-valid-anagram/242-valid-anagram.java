class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[26];
        int brr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            brr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}