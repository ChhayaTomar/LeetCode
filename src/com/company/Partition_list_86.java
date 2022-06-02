package com.company;

public class Partition_list_86 {
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
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public Node partition(Node head, int x) {
        Node beforeHead=new Node(0);
        Node afterHead=new Node(0);
        Node before=beforeHead;
        Node after=afterHead;

        if(head==null || head.next==null) return head;
        while(head!=null){
            if(head.data < x){
                before.next=head;
                before=before.next;
            }else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }

        after.next=null;
        before.next=afterHead.next;
        return beforeHead.next;
    }
    public static void main(String[] args) {
        Partition_list_86 ll=new Partition_list_86();
        ll.insertAtLast(1);
        ll.insertAtLast(4);
        ll.insertAtLast(3);
        ll.insertAtLast(2);
        ll.insertAtLast(5);
        ll.insertAtLast(2);
        ll.display();
        ll.head= ll.partition(ll.head,3);
        ll.display();
    }
}
