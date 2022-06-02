package com.company;

public class Swap_nodes_in_pairs_24 {
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
        }
    }
    public Node swapPairs(Node head){
        Node dummy=new Node(0);
        dummy.next=head;
        Node curr=dummy;

        while(curr!=null){
            Node first=curr.next;
            Node second=null;
            if(first!=null){
                second=first.next;
            }
            if(second!=null){
                Node node=second.next;
                second.next=first;
                curr.next=second;
                first.next=node;
                curr=first;

            }else break;
        }
        return dummy.next;
    }

    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Swap_nodes_in_pairs_24 ll = new Swap_nodes_in_pairs_24();
        //Swap_nodes_in_pairs_24 ll2=new Swap_nodes_in_pairs_24();
        ll.insertAtLast(1);
        ll.insertAtLast(2);
        ll.insertAtLast(3);
        ll.insertAtLast(4);
        ll.display();
        ll.head=ll.swapPairs(ll.head);
        ll.display();

    }
}
