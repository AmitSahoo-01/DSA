package DSA.LinkedList;

public class imple {
    public static void display(SimpleLinkedList n){
        SimpleLinkedList temp = new SimpleLinkedList();
        temp  = n;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SimpleLinkedList l1 = new SimpleLinkedList(10);
        SimpleLinkedList l2 = new SimpleLinkedList(20);
        SimpleLinkedList l3 = new SimpleLinkedList(60);
        SimpleLinkedList l4 = new SimpleLinkedList(50);
        SimpleLinkedList l5 = new SimpleLinkedList(70);
        SimpleLinkedList l56 = new SimpleLinkedList(70);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l56;
        display(l1);
    }
}


class SimpleLinkedList{
    int val;
    SimpleLinkedList next;
    SimpleLinkedList(int val){
        this.val = val;
    }
    SimpleLinkedList(){

    }
}
