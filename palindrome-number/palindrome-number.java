class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int prev = x, rev=0;
            while(x!=0){
                int rem = x%10;
                rev = (rev*10)+rem;
                x=x/10;
            }
            if(prev==rev){
                return true;
            }
            return false;
        }
        else{
            return false;
        }
    }
}