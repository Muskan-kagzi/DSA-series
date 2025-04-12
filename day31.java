// que1 https://leetcode.com/problems/remove-linked-list-elements/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
TC-O(N)
SC-O(1)
// que2: https://leetcode.com/problems/add-two-numbers/ 
  class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,sum=0;
        ListNode temp=new ListNode(-1);
        ListNode head=temp;
        ListNode temp1=l1;
        ListNode temp2=l2;
        while(temp1!=null||temp2!=null){
            if(temp1!=null&&temp2!=null){
                sum=temp1.val+temp2.val+carry;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else if(temp1==null){
                sum=temp2.val+carry;
                temp2= temp2.next;
            }
            else if(temp2==null){
                sum=temp1.val+carry;
                temp1= temp1.next;
            }
            ListNode a=new ListNode(sum%10);
            temp.next=a;
            temp=a;
            carry=sum/10;
        }
        if(carry>0){
            ListNode a=new ListNode(carry);
            temp.next=a;
            temp=a;
        }
        return head.next;
    }
}
TC-O(max(m, n))
SC-O(max(m, n))
