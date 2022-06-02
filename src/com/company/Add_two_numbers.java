package com.company;

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
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy=new Node(0);
        Node head1=l1;
        Node head2=l2;
        Node curr=dummy;
        int carry=0;

        while(head1!=null || head2!=null){
            int x=(head1!=null) ? head1.data : 0;
            int y=(head2!=null) ? head2.data : 0;
            int sum=x+y+carry;
            carry=sum/10;

            curr.next= new Node(sum%10);
            curr=curr.next;
            if(head1 !=null) head1=head1.next;
            if(head2 !=null) head2=head2.next;

        }
        if(carry>0){
            curr.next=new Node(carry);
        }
        return dummy.next;

    }

    public void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
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
        l1.display(l1.head);
        l2.display(l2.head);
        Add_two_numbers l3=new Add_two_numbers();
        l3.head=l3.addTwoNumbers(l1.head,l2.head);
        l3.display(l3.head);


    }
//    public static Node addTwoNumbers(Node l1, Node l2){
//
//    }

}

