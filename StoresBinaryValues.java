package PW_Linkedlist.Assignment;

public class StoresBinaryValues {
    public static Node update(Node head) {
        int count = 0;
        Node prev = null, curr = head;
        while (curr != null) {
            if (curr.data == 1) {
                if (count % 2 == 1) {
                    prev.next = new Node(0);
                    prev = prev.next;
                    prev.next = curr;
                }
                count = 0;
            } else {
                count++;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    public static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        //Insert
        void insert(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;
            }
            tail = temp;
        }
        // Insert function closed

        // Print
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }





        public static void main(String[] args) {
            linkedlist l = new linkedlist();
            l.insert(1);
            l.insert(0);
            l.insert(0);
            l.insert(1);
            l.insert(0);
            l.insert(1);
            l.head = update(l.head);
            l.print();


        }
    }

