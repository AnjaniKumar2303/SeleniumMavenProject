package Coding.LinkedList;

public class LinkedListClass {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    public LinkedListClass insert(LinkedListClass l, int data) {

        Node newNode = new Node(data);

        if (l.head == null) {
            head = newNode;
        } else {

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return l;
    }

    public void printAll(LinkedListClass l) {

        Node temp = l.head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public static void main(String[] args) {

        LinkedListClass l = new LinkedListClass();
        l=l.insert(l, 10);
        l=l.insert(l,20);

        l.printAll(l);


    }

}
