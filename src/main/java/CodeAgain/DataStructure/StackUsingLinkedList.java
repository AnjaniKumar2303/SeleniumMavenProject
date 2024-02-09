package CodeAgain.DataStructure;

public class StackUsingLinkedList {

    Node top;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    void push(int data) {
        Node newNode = new Node(data);

        if(top == null) {
            top = newNode;
        } else {
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
    }

    public int pop() {
        if(top == null)  {
            System.out.println("Stack is empty");
        }
        Node temp = top.next;
        top = top.next;
        return temp.data;

    }

    public void display() {
        if(top == null) {
            System.out.println("Stack is empty");
        }

        Node temp = top;
        while(temp !=null) {
            System.out.println(temp.data);
            temp = temp.next;
            if(temp!=null) {
                System.out.println("->");
            }

        }
    }

    public static void main(String[] args) {

        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();

    }
}
