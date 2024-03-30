import java.util.*;
 
public class intro{
    public  static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
     }
     public static Node head;
     public static Node tail;

     public void addFirst(Node data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
     }
     public void addLast(Node data){
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=tail;
        tail=newNode;
     }

     public void print(Node data){
        if (head==null) {
            System.out.print("empty");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
       

     }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.addLast(2);
        ll.addLast(6);

        ll.print();

        



    }
}