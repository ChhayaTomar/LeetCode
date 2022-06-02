package com.company;

public class Sort_list_148 {
    public class Node{
        int data;
        Node next;

        Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    Node head=null;
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
    public void display(Node Head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public Node sortList(Node head){
        if(head==null || head.next==null) return head;
        Node s=head;
        Node f=head;
        Node curr=head;
        while(f!=null && f.next!=null){
            curr=s;
            s=s.next;
            f=f.next.next;
        }
        curr.next=null;
        Node left=sortList(head);
        Node right=sortList(s);
        return mergeTwoSortedList(left,right);
    }

    public Node mergeTwoSortedList(Node left, Node right) {
        Node newNode=new Node(0);
        Node curr=newNode;
        while(left!=null && right!=null){
            if(left.data<right.data){
                curr.next=left;
                left=left.next;
            }else{
                curr.next=right;
                right=right.next;
            }
            curr=curr.next;
        }
        if(left!=null){
            curr.next=left;
//            left=left.next;
//            curr=curr.next;
        }
        if(right!=null){
            curr.next=right;
//            right=right.next;
//            curr=curr.next;

        }
        return newNode.next;
    }

    public static void main(String[] args) {
        Sort_list_148 ll=new Sort_list_148();
        Sort_list_148 ll2=new Sort_list_148();
        ll.insertAtLast(4);
        ll.insertAtLast(2);
        ll.insertAtLast(1);
        ll.insertAtLast(3);
        ll.display(ll.head);
        ll2.head=ll.sortList(ll.head);
        ll2.display(ll2.head);
    }
}
