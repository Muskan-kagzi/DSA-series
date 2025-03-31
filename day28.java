// Q1: https://leetcode.com/problems/linked-list-cycle/
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            if(fast.next==null){
                return false;
            }
            fast=fast.next.next;
            if(slow.next==null) return false;
            slow=slow.next;
            if(fast==slow)
            return true;
        }
        return false;
    }
}
TC-O(N)
SC-O(1)
// Q2: https://leetcode.com/problems/middle-of-the-linked-list/ 
  class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode slow=head;        
    ListNode fast=head;
    while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow =slow.next;
    }  
    return slow;      

    }
}
TC-O(N)
SC-O(1)
