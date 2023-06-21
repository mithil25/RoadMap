class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { 
        this.val = val;
        this.next = null; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solve
{
    ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ){
            return null;
        }
        int k = n;
        ListNode slow,fast,prev;
        slow = fast = head;
        prev = null;
        while(k-- > 0 && fast!=null){
            fast = fast.next;
        }
        while(fast!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev == null) {
            slow = slow.next;
            head = slow;
        }
        else {
            prev.next = slow.next; 
        }
        return head;
    }
    void printList(ListNode list){
        while(list != null){
            System.out.printf("%d ",list.val);
            list = list.next;
        }
         System.out.print("\n");
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        Solve s1 = new Solve();
        s1.printList(l1);
        l1 = s1.removeNthFromEnd(l1, 2);
        s1.printList(l1);

    }
}