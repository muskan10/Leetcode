/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res=new ListNode();
        ListNode temp=res;
        while(list1!=null || list2!=null){
            if(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    ListNode r = new ListNode(list1.val);
                    temp.next=r;
                    r.next=null;
                    temp=temp.next;
                    list1=list1.next;
                }
                else{
                    ListNode r = new ListNode(list2.val);
                    temp.next=r;
                    r.next=null;
                    temp=temp.next;
                    list2=list2.next;
                }
            }
            else if(list2==null){
                ListNode r = new ListNode(list1.val);
                    temp.next=r;
                    r.next=null;
                    temp=temp.next;
                    list1=list1.next;
            }
            else{
                    ListNode r = new ListNode(list2.val);
                    temp.next=r;
                    r.next=null;
                    temp=temp.next;
                    list2=list2.next;
            }
        }
        res=res.next;
        return res;
    }
}