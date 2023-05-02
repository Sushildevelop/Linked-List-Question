package PW_Linkedlist.Assignment;

public class RemoveAll_X_nodes {
    public static class Node{
        char data;
        Node next;
        // Constructor
        Node(char data){
            this.data=data;
        }
    }
        public static class LinkList{
            Node head=null;
            Node tail=null;

            void insertAtEnd(char val){
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
                while(temp!=null){
                    System.out.print(temp.data+" -> ");
                    temp=temp.next;
                }
            }

            void remove() {
                Node temp = head;
                while (temp != null && head.data == 'x') {
                    temp = temp.next;
                }
                Node prev = null;
                Node curr = head;
                while (curr != null) {
                    if (curr.data == 'x') {
                        prev.next = curr.next;
                    } else {
                        prev = curr;
                    }
                    curr = prev.next;
                }

            }
        }

    public static void main(String[] args) {
        LinkList list=new LinkList();
        list.insertAtEnd('g');
        list.insertAtEnd('x');
        list.insertAtEnd('a');
        list.insertAtEnd('b');
        list.insertAtEnd('c');
        list.insertAtEnd('x');
        list.insertAtEnd('z');
     list.remove();
     list.display();

    }
}
