class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<=(s.length-1)/2;i++){
            char x = s[i];
            s[i]=s[s.length-(i+1)];
            s[s.length-(i+1)]=x;
        }
    }
}