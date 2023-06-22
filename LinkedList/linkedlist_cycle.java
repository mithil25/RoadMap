 
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

 class Solve
 {
    
     boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow ,fast;
        slow = fast = head;
        while(slow!= null && fast !=null){
            slow = slow.next;
            fast = fast.next != null ? fast.next.next: fast.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = l1.next;
        Solve s = new Solve();
        boolean b = s.hasCycle(l1);
        System.out.println(b ? "true" : "false");
    }
}