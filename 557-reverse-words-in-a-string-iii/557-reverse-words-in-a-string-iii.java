class Solution {
    public String reverseWords(String s) {
        String res="";
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            res+=sb.toString();
            if(i!=arr.length-1){
                res+=" ";
            }
        }
        return res;
    }
}