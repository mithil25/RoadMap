
class ListNode 
{
      int val;
      ListNode next;
      ListNode() {
      }
      ListNode(int val) { 
        this.val = val;
        this.next = null; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solve {
     void print(ListNode node) {
        while(node!=null)
        {
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
     }
     ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = null;
        ListNode pointer = null;
        int net = 0;
        int carry = 0;
        while(l1 != null && l2 != null)
        {
            net = (l1.val+l2.val+carry);
            carry = net/10;
            if(sum == null)
            {
                sum = new ListNode(net%10,null);
                pointer = sum;
            }
            else
            {
                pointer.next = new ListNode(net%10,null);
                pointer = pointer.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            pointer.next = new ListNode((l1.val+carry)%10,null);
            carry = (l1.val+carry)/10;
            pointer = pointer.next;
            l1 = l1.next;
        }
        while(l2!=null)
        {
            pointer.next = new ListNode((l2.val+carry)%10,null);
            carry = (l2.val+carry)/10;
            pointer = pointer.next;
            l2 = l2.next;
        }
        if(carry!=0){
            pointer.next = new ListNode(carry,null);    
        }
        return sum;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);
        Solve s1 = new Solve();
        s1.print(l1);
        s1.print(l2);
        ListNode l3 = s1.addTwoNumbers(l1, l2);
        s1.print(l3);
    }
}