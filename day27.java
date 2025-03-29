Q1: https://bit.ly/3w6hUaa
Q2: https://bit.ly/3QlEoMx 
class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }

        if (x == 1) { // Deleting the first node
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

