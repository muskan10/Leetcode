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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=null;
            ListNode temp = res;
        int carry=0;
        while(l1!=null && l2!=null){
            int x = l1.val + l2.val+ carry;
            ListNode new_node = new ListNode(x%10);
            if(res==null){
                res = new ListNode(x%10);
                temp=res;
            }
            else{
                new_node.next = null;
                temp.next = new_node;
                temp=temp.next;
            }
            l1=l1.next;
            l2=l2.next;
            carry = x/10;
        }
        while(l1!=null){
            int x = l1.val +carry;
            ListNode new_node = new ListNode(x%10);
            if(res==null){
                res = new ListNode(x%10);
                temp=res;
            }
            else{
                new_node.next = null;
                temp.next = new_node;
                temp=temp.next;
            }
            l1=l1.next;
            carry = x/10;
        }
        while(l2!=null){
            int x = l2.val +carry;
            ListNode new_node = new ListNode(x%10);
            if(res==null){
                res = new ListNode(x%10);
                temp=res;
            }
            else{
                new_node.next = null;
                temp.next = new_node;
                temp=temp.next;
            }
            l2=l2.next;
            carry = x/10;
        }
        if(carry!=0){
            while(carry!=0){
                ListNode new_node = new ListNode(carry%10);
                carry=carry/10;
                if(res==null){
                    res = new ListNode(carry%10);
                    temp=res;
                }
                else{
                    new_node.next = null;
                    temp.next = new_node;
                    temp=temp.next;
                }
            }
        }
        return res;
    }
}