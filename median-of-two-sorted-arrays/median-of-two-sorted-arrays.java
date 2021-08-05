class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i=0,x=0,y=0;
        while(x!=nums1.length || y!=nums2.length){
            if(x!=nums1.length && y!=nums2.length){
                if(nums1[x]<nums2[y]){
                    arr[i++]=nums1[x];
                    x++;
                }
                else{
                    arr[i++]=nums2[y];
                    y++;
                }
            }
            else if(x!=nums1.length){
                arr[i++]=nums1[x];
                x++;
            }
            else{
                arr[i++]=nums2[y];
                y++;
            }
        }
        //System.out.println(arr[(arr.length/2)-1]);
        if(arr.length%2==0){
            return (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        }
        else{
            return (arr[(arr.length/2)]);
        }
    }
}