//Swapping Nodes in a linked list

/*You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning
 and the kth node from the end (the list is 1-indexed). */



package May;

public class May15 {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
    ListNode t1=head;
    ListNode t2=head;
    ListNode size=head;
    int cnt=0;
        while (size != null) {
            size=size.next;
            cnt++;//to measure the size
        }
    //now take both pointers to reqd position and then do the swapping
        for(int i=1;i<k;i++){
            t1=t1.next;
        }
        for(int i=1;i<cnt-k+1;i++){
            t2=t2.next;
        }
    //now swap values
        int temp=t1.val;
        t1.val=t2.val;
        t2.val=temp;
        return head;
    }
}
