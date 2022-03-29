package com.company.medium;

public class Add_two_numbers {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertAtLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            //size++;
        } else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
            //size++;
        }
    }

    public static void main(String[] args) {
        Add_two_numbers l1 = new Add_two_numbers();
        Add_two_numbers l2 = new Add_two_numbers();
        l1.insertAtLast(2);
        l1.insertAtLast(4);
        l1.insertAtLast(3);
        l2.insertAtLast(5);
        l2.insertAtLast(6);
        l2.insertAtLast(4);
//        addTwoNumbers( l1.head, l2.head);
    }
//    public static Node addTwoNumbers(Node l1, Node l2){
//
//    }

}

