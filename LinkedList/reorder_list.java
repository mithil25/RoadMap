
class ListNode 
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { 
        this.val = val;
        this.next = null; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solver {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        l1.next.next.next.next.next = new ListNode(6);
        Solver s1 = new Solver();
        s1.print(l1);
        s1.reorderList(l1);
        s1.print(l1);

    }
    public void reorderList(ListNode head) {
        if(head==null || head.next == null ){
            return;
        }
        ListNode slow,fast,prev;
        slow = fast = head;
        prev = null;
        while(fast != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next != null ? fast.next.next:fast.next;
        }
        prev.next = null;
        slow = reverse(slow);
        fast = head;
        ListNode pointer = null;
        head = fast;
        pointer = fast;
        fast = fast.next;
        boolean lock = true;
        while(fast!=null || slow!=null)
        {
            if(lock){
                pointer.next = slow;
                slow = slow.next;
                lock = false;
            }
            
            else{
                pointer.next = fast;
                fast = fast.next;
                lock = true;
            }
            pointer = pointer.next;
        }
        while(slow!=null)
        {
            pointer.next = slow;
            slow = slow.next;
            pointer = pointer.next;
        }
    }
    void print(ListNode node) {
        while(node!=null)
        {
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
     }
    ListNode reverse(ListNode head)
    {
        ListNode current = head;
        ListNode next,prev;
        next = prev = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}