//Maximum Twin sum of Linked list

/*In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, 
if 0 <= i <= (n / 2) - 1.

For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
The twin sum is defined as the sum of a node and its twin.

Given the head of a linked list with even length, return the maximum twin sum of the linked list. */




package May;

public class May17 {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
        
       class Solution {
            public int pairSum(ListNode head) {
               int maxi=0;
               ListNode mid=middle(head);
               //now reverse the linked list from the middle
               ListNode prev=null;
               ListNode n=null;
              // ListNode curr=mid;
               while(mid!=null){
                   n=mid.next;
                   //move pointers
                   mid.next=prev;
                   prev=mid;
                   mid=n;
               }
       
               //we get our mid
               ListNode t1=head;//head of original list
               ListNode t2=prev;
               while(t2!=null){
                   //calculate values and move both pointers ahead
                   maxi=Math.max(maxi,t1.val+t2.val);
                   t1=t1.next;
                   t2=t2.next;
               }
       
             return maxi;
           }
       
           //middle of linked list
           public ListNode middle(ListNode head){
               ListNode s=head;
               ListNode f=head;
               //fast and slow pointer
               while(f!=null && f.next!=null){
                   f=f.next.next;
                   s=s.next;
               }
               return s;
           }
           
       }
}
