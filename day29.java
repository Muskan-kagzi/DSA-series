Q1: https://bit.ly/3dyXL6m
class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        if(head==null||head.next==null) return 0;
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
               int i=1;
               fast=fast.next;
               while(fast!=slow){
                   fast=fast.next;
                   i++;
                }
                return i;
            }
        }
        
        return 0;
    }
}
TC-o(n)
SC-O(1)
  
Q2: https://leetcode.com/problems/palindrome-linked-list/ class Solution {
class Solution {
    public boolean isPalindrome(ListNode head) {
       Stack<Integer> st =new Stack<>();
       ListNode curr=head;
       while(curr!=null){
        st.push(curr.val);
        curr=curr.next;
       }
       curr=head;
       while(curr!=null){
        if(st.peek()!=curr.val){
            return false;
        }
        else{
            st.pop();
            curr=curr.next;
        }
       }
       return true;
    }
}
TC-o(n)
SC-O(n)
  
