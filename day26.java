// Q1: https://bit.ly/3QD4hHs
// problem :- insertion at any index of doubly linked list
class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        if (head == null) {
            // Initialize the list if it's empty
            return new Node(x);
        }
        Node temp = head;
        for (int i = 0; i < p; i++) {
            if (temp.next == null) break; // Avoid null reference
            temp = temp.next;
        }
    
        Node newNode = new Node(x);
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    
        return head;
    }
}
// TC-O(n)
// SC-O(1)
// Q2: https://bit.ly/3Epriup 
// problem :-Search in Linked List
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(head==null){
            return false;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }
}
// TC-O(n)
// SC-O(1)
