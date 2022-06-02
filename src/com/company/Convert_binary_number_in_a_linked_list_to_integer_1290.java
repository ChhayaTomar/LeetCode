package com.company;

public class Convert_binary_number_in_a_linked_list_to_integer_1290 {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head = null;

    public void add(int x) {
        Node newNode = new Node(x);
        if (head == null) head = newNode;
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public static int getDecimalValue(Node head) {
        String str = "";
        while (head != null) {
            str = str + head.val;
            head = head.next;
        }
        int num = Integer.parseInt(str, 2);
        return num;
    }

    public static void main(String[] args) {
        Convert_binary_number_in_a_linked_list_to_integer_1290 ll = new Convert_binary_number_in_a_linked_list_to_integer_1290();
        ll.add(1);
        ll.add(0);
        ll.add(1);
        System.out.println(getDecimalValue(ll.head));
    }
}
