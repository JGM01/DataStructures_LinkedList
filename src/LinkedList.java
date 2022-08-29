/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
    public Node head, tail;

    //constructor method to create a list of object with head, tail, and size.
    public LinkedList()
    {
        head = null;
        tail = null;
    }

    //method add node to end of list
    public void addLastNode(int data)
    {
        if (tail == null)
            head = tail = new Node(data); //empty list
        else
        {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    }

    //======== Your part to complete for this assignment =========

    //method #1: add first node
    public void addFirstNode(int data)
    {
        var newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //method #2: add node at index
    public void addAtIndex(int index, int data)
    {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        if (index >= countNodes()) {
            System.out.println("Invalid index, try again.");
            return;
        }

        var newNode = new Node(data);
        var current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    //method #3: remove first node
    public void removeFirstNode()
    {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        head.next = head;
    }

    //method #4: remove last node
    public void removeLastNode()
    {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        var newTail = head;
        while (newTail.next.next != null) {
            newTail = newTail.next;
        }

        newTail.next = null;
    }

    //method #5: remove node at index
    public void removeAtIndex(int index)
    {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        if (index >= countNodes()) {
            System.out.println("Invalid index, try again.");
            return;
        }

        var current = head;
        for (int i = 0; i < index-1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
    }

    //method #6: countNodes
    public int countNodes()
    {
        int listSize= 0;
        var current = head;
        while (current.next != null) {
            current = current.next;
            listSize++;
        }
        return listSize;
    }

    //method #7: pritnInReverse  (Recursive method)
    public void printInReverse(Node L)
    {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        printInReverse(head.next);
        System.out.print(head.data + " ");

    }

    //================= end of your part ==============

    //method to print out the list
    public void printList()
    {
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}

