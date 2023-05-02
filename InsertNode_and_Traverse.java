package PW_Linkedlist.Assignment;

public class InsertNode_and_Traverse {
    public static class Node{
        int data;
        Node next;
        // constructor
        Node(int data){
            this.data=data;
        }
    }
    public static class Linked{
        Node head=null;
        Node tail=null;
        void InsertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;

            }
            tail=temp;
        }
        void display(){
            Node temp=head;
            // Traversal
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        Linked li=new Linked();
        li.InsertAtEnd(2);
        li.InsertAtEnd(4);
        li.InsertAtEnd(6);
        li.InsertAtEnd(7);
        li.InsertAtEnd(8);
        li.InsertAtEnd(9);
        li.display();
    }
}
