class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String arr[]=new String[str.length];
        for(int i=0;i<str.length;i++){
            String st2=str[i].replaceAll("[^0-9]", "");
            arr[Integer.parseInt(st2)-1] = str[i].replaceAll("[^A-Za-z]", "");
        }
        String res = "";
        for(int i=0;i<arr.length;i++){
            res+=arr[i];
            if(i!=arr.length-1){
                res+=" ";
            }
        }
        return res;
    }
}