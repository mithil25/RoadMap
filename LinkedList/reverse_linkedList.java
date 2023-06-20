
class LinkedList{
    int data;
    LinkedList next;
    LinkedList(){
        data = 0;
        next = null;
    }
    LinkedList(int data) {
        this.data = data;
        next = null;
    }
    void insert(int data) {
        LinkedList temp = new LinkedList(data);
        temp.next = next;
        next = temp;
    }
    void add(LinkedList head,int data){
        LinkedList temp = new LinkedList(data);
        while(head.next != null){
            head = head.next;
        }
        head.next = temp;
    }
    void print(){
        LinkedList data = this;
        while(data!=null){
            System.out.print(data.data+" ");
            data = data.next;
        }
        System.out.print("\n");
    }

}
class Solution {
    LinkedList reverseList(LinkedList head) {
        LinkedList current = head;
        LinkedList next = head;
        LinkedList temp = null;
        while(current!=null){
            next = current.next;
            current.next = temp;
            temp = current;
            current = next;   
        }
        return temp;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.insert(2);
        ll.add(ll, 3);
        ll.add(ll, 4);
        ll.add(ll, 5);
        ll.add(ll, 6);
        ll.print();
        Solution s1 = new Solution();
        ll = s1.reverseList(ll);
        ll.print();
    }
}
