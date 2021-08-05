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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = null;
        ListNode temp=res;
        while(l1!=null || l2!=null){
            if(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    ListNode node = new ListNode(l1.val);
                    if(res==null){
                        res = new ListNode(l1.val);
                        temp=res;
                    }
                    else{
                        node.next=null;
                        temp.next=node;
                        temp=temp.next;
                    }
                    l1=l1.next;
                }
                else{
                    ListNode node = new ListNode(l2.val);
                    if(res==null){
                        res = new ListNode(l2.val);
                        temp=res;
                    }
                    else{
                        node.next=null;
                        temp.next=node;
                        temp=temp.next;
                    }
                    l2=l2.next;
                }
            }
            else if(l1!=null){
                    ListNode node = new ListNode(l1.val);
                    if(res==null){
                        res = new ListNode(l1.val);
                        temp=res;
                    }
                    else{
                        node.next=null;
                        temp.next=node;
                        temp=temp.next;
                    }
                    l1=l1.next;
            }
            else{
                    ListNode node = new ListNode(l2.val);
                    if(res==null){
                        res = new ListNode(l2.val);
                        temp=res;
                    }
                    else{
                        node.next=null;
                        temp.next=node;
                        temp=temp.next;
                    }
                    l2=l2.next;
            }
            ListNode tra = res;
            while(tra.next!=null){
                System.out.print(tra.val+" ");
                tra=tra.next;
            }
        }
        return res;
    }
}