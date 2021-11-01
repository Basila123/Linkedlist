package com.bridgelabzAddress;

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

    public Node pop() {
        Node temp = head;
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            head = head.next;
        }
        return temp;
    }

    public Node popLast() {
        Node node = head;
        Node previous = null;
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            while (!node.next.equals(tail)) {
                node = node.next;
            }
            node.next = null;
            this.tail = node;
        }
        return node;
    }
    public int search(int key) {
        Node node = head;
        if (head == null) {
            System.out.println("The list is empty");
        } else {
            head = head.next;
            if (head.data == key) {
                System.out.println("The value is present");

            } else {
                System.out.println("The value is not present");

            }
        }
        return key;
    }

}





