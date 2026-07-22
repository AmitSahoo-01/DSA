package DSA.LinkedList;

public class reImpLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(12);
        Node n2 = new Node(23);
        Node n3 = new Node(44);
        Node n4 = new Node(98);
        Node n5 = new Node(56);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        display(n1);
        System.out.println();
        display(n1);
        System.out.println();

        System.out.println(getElem(n1,4));

    }
    public static void display(Node n){
        Node temp = n;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    public static void disRec(Node n){
        Node temp = n;
        if(temp == null){
            System.out.print(temp.val);
        }
        disRec(temp=temp.next);
    }
    public static int getElem(Node n,int ele){
        Node temp = n;
        for (int i=1;i<ele-1;i++){
            temp=temp.next;
        }
        return  temp.val;
    }

}
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
