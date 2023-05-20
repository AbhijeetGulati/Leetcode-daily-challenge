//Swap Nodes in Pairs
/* 
Given a linked list, swap every two adjacent nodes and return its head. 
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.) */


package May;

class Solution { 
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        //edge case
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null &&  curr.next!=null){
            //2 cases
            ListNode newnext=curr.next;
                //curr is at head
                curr.next=newnext.next;
                newnext.next=curr;//swapping curr and newnext

                 if(prev==null){
                     //reassign head
                     head=newnext;
                 }else{
                     prev.next=newnext;
                 }
                 //move pointers ahead
                 prev=curr;
                 curr=curr.next;
        }
        return head;
    }
}