package com.company.easy;

public class Middle_of_the_linked_list_876 {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val= val;
            this.next=null;
        }
    }
    Node head=null;

    public void add(int x){
        Node newNode=new Node(x);
        if(head==null) head=newNode;
        else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    public void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public Node middleNode(Node head) {
        Node curr=head;
        int size=0;

        while(curr!=null){
            curr=curr.next;
            size++;
        }
        int mid=size/2;
        int i=0;
        curr=head;
        while(i<mid){
            curr=curr.next;
            i++;
        }
        head=curr;
        return head;

    }
    public static void main(String[] args) {
        Middle_of_the_linked_list_876 ll=new Middle_of_the_linked_list_876();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.display(ll.head);
        ll.head=ll.middleNode(ll.head);
        ll.display(ll.head);
    }
}
