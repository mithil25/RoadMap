
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val;this.next = null; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    void printList(ListNode list){

        while(list != null){
            System.out.printf("%d ",list.val);
        }
         System.out.print("\n");
    }
     ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode mergeHead = null;
        ListNode pointer = null;
        if(list1!=null && list2 != null)
        {
            if(list1.val < list2.val){
                mergeHead = list1;
                pointer = mergeHead;
                list1 = list1.next;
            }
            else
            {
                mergeHead = list2;
                pointer = mergeHead;
                list2 = list2.next;
            }
        }
        else if(list1!=null && list2 == null)
        {
                mergeHead = list1;
                pointer = mergeHead;
                list1 = list1.next;
        }
        else
        {
                mergeHead = list2;
                pointer = mergeHead;
                list2 = list2.next;
        }
        while(list1 != null && list2 != null)
        {
            if(list1.val<list2.val)
            {
                pointer.next = list1;
                list1 = list1.next;
            }
            else{
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        while(list1!=null){
             pointer.next = list1;
             pointer = pointer.next;
             list1 = list1.next;
        }
        while(list2!=null){
             pointer.next = list2;
             pointer = pointer.next;
             list2 = list2.next;
        }
        return mergeHead;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(7);
        Solution s1 = new Solution();
        ListNode l3 = s1.mergeTwoLists(l1,l2);
        s1.printList(l3);

    }
}