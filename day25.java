Q1: https://leetcode.com/problems/delete-node-in-a-linked-list/
class Solution {
    public void deleteNode(ListNode node) {
        if(node==null||node.next==null){
            return;
        }
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
// TC-O(1)
// SC-O(1)
// Q2: https://bit.ly/3w9pEIt 
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp=new Node(x);
        if(head==null){
            head=temp;
            return head;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
}
// TC-O(n)
// SC-O(1)
