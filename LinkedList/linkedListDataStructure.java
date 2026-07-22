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
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
    }
}
