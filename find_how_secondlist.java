package PW_Linkedlist.Assignment;

import java.util.Scanner;

public class find_how_secondlist {
    public static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
        }
    }
    public static class linked{
        Node head=null;
        Node tail=null;
     void insertEnd(int val){
     Node temp=new Node(val);
     if (head==null){
         head=temp;

     }
     else {
         tail.next=temp;
     }
     tail=temp;
     }
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println( );
        }
        void count(Node head1,Node head2){
         Node temp=head1;
         while(temp!=null){
             int count=0;
             Node temp2=head2;
             while(temp2!=null){
                 if(temp2.data<temp.data){
                     count++;
                 }
                 temp2=temp2.next;
             }
             System.out.print(count+" ");
             temp=temp.next;
         }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        linked li=new linked();
        System.out.println("size of first list");
        for (int i=0;i<n;i++){
            li.insertEnd(sc.nextInt());
        }
        System.out.println("size of second list");
        linked li2=new linked();
        for (int i=0;i<m;i++){
            li2.insertEnd(sc.nextInt());
        }
        li.print();
        li2.print();
        li.count(li.head,li2.head);
    }
}
