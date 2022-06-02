package com.company;

public class Odd_even_linked_list_328 {
    class Node {
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

    public void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node oddEvenList(Node head) {
        if (head == null) return null;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        Odd_even_linked_list_328 ll = new Odd_even_linked_list_328();
        Odd_even_linked_list_328 newLL = new Odd_even_linked_list_328();
        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
        ll.insertAtLast(4);
        ll.insertAtLast(5);
        ll.display(ll.head);

        newLL.head = newLL.oddEvenList(ll.head);
        newLL.display(newLL.head);

    }
}
