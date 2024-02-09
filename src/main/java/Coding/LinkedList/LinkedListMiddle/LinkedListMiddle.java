package Coding.LinkedList.LinkedListMiddle;


class LinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node insertNode(int data, Node head) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }


    void printAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    int findMiddle(Node head) {

        Node temp = head;
        Node temp1 = head;

        while (temp1.next != null) {
            temp1 = temp1.next.next;
            temp = temp.next;
        }
        return temp.data;
    }
}

public class LinkedListMiddle {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.head = null;

        ll.head = ll.insertNode(10, ll.head);
        ll.head = ll.insertNode(20, ll.head);
        ll.head = ll.insertNode(30, ll.head);
        ll.head = ll.insertNode(40, ll.head);
        ll.head = ll.insertNode(50, ll.head);

        ll.printAll(ll.head);

        System.out.println(ll.findMiddle(ll.head));
    }
}
