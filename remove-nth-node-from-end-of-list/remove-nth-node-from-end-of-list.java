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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        
        ListNode first = temp, second=temp;
        for(int i=0;i<=n;i++){
            first=first.next;
        }
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        //System.out.println(second.val);
        second.next=second.next.next;
        return temp.next;
    }
}