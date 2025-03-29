Q1: https://bit.ly/3w6hUaa
// PROBlem:-reverse the doubly linked list
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode curr=head;
        DLLNode after=null;
        DLLNode early=null;
        while(curr!=null){
            after=curr.next;
            curr.next=early;
            early=curr;
            curr=after;
        }
        return early;
    }
}
TC-O(N)
SC-O(1)
Q2: https://bit.ly/3QlEoMx 
PROBLEM:-deletion in doubly linked list
class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }

        if (x == 1) { 
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        Node curr = head;
        int i = 1;

        while (i < x - 1 && curr != null) {
            curr = curr.next;
            i++;
        }

        if (curr == null || curr.next == null) {
            return head;
        }

        curr.next = curr.next.next;
        if (curr.next != null) {
            curr.next.prev = curr;
        }

        return head;
    }
}
TC-O(N)
SC-O(1)
