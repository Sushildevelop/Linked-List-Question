package PW_Linkedlist.Assignment;

public class count_Odd_Even_Number {
    public static class Node{
        int data;
        Node next;
        // Constructor
        Node(int data){
            this.data=data;
        }
    }
    public static class Linked_L{
        Node head=null;
        Node tail=null;
        void InserAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        int evenNumber(){

            int even=0;


            Node curr=head;
            while(curr!=null){
                if(curr.data%2==0){
                    even++;
                }
               curr=curr.next;
            }
            return even;
        }
        int oddNumber(){
            int size2=0;

            Node curr=head;
            while (curr!=null){
                if(curr.data%2!=0){
                    size2++;
                }
                curr=curr.next;
            }
            return size2;
        }
        void print(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Linked_L lis=new Linked_L();
        lis.InserAtEnd(1);
        lis.InserAtEnd(2);
        lis.InserAtEnd(2);
        lis.InserAtEnd(3);
        lis.InserAtEnd(5);
        lis.print();
        int evennumber1= lis.evenNumber();
        System.out.println("even "+evennumber1);
        System.out.println("odd "+lis.oddNumber());

    }
}
