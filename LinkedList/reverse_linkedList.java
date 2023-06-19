
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
}
class reverse_linkedList {
    public LinkedList reverseList(LinkedList head) {
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
}
