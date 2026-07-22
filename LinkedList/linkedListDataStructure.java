package DSA.LinkedList;
class Node{
    int val ;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedList{
    Node head; //null at first
    Node tail;//null first
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addAtHead(int val) {
        Node temp = new Node(val);
        if (head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void deleteAtHead() {
        if (head == null){
            System.out.println("list id empty");
            return;
        }else{
            head = head.next;
            if (head == null) tail=null;
        }
        size--;
    }

    public int searchElem(int val) {
        if(head == null){
            return -1;
        }
        Node temp = head;
        int idx =0;
        while(temp != null){
            if(temp.val == val){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public void insertEle(int val, int idx) {
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if (idx == 0 ) addAtHead(val);
        else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
}
public class linkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(490);
        ll.addAtHead(300);
        ll.display();
//        ll.deleteAtHead();
//        ll.deleteAtHead();
//        ll.display();
        System.out.println(ll.size);
        int idx = ll.searchElem(40);
        System.out.println(idx);
        ll.display();
        ll.addAtTail(2333);
        ll.display();
        ll.addAtHead(9000);
        ll.display();
        System.out.println(ll.size);
        ll.insertEle(15,0);
        ll.display();
        System.out.println(ll.size);

    }
}
