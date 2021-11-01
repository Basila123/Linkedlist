package com.bridgelabzAddress;
import java.util.List;
public class LinkedList {
    Node head;
    Node tail;

    public Node push(int data) {
        Node newnode = new Node(data, null);//get from class Node through constructor
        if (head == null) {
            this.head = newnode;//using this we can point to the object called.
            this.tail = newnode;

        } else {
            Node temp = head;
            this.head = newnode;
            newnode.next = temp;
        }
        return newnode;
    }

    public Node append(int data) {
        Node newnode = new Node(data, null);
        if (head == null) {
            this.tail = newnode;
            this.head = newnode;
        } else {
            Node temp = tail;
            this.tail = newnode;
            temp.next = newnode;
        }
        return newnode;
    }

    public void traverse() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}






