package com.company.hard;

import com.company.medium.Partition_list_86;

import java.util.*;

public class Merge_k_sorted_lists_23 {
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
    public void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public Node mergeKLists(Node[] lists){
        if(lists.length==0) return null;
        Queue<Node> queue=new LinkedList<>();
        for(int i=0;i<lists.length;i++){
            queue.add(lists[i]);
        }

        while(queue.size()!=1){
            Node left=queue.remove();
            Node right=queue.remove();
            queue.add(mergeTwoSortedLists(left,right));
        }

        return queue.remove();
    }

    public Node mergeTwoSortedLists(Node left, Node right){
        Node newNode=new Node(0);
        Node curr=newNode;

        while(left!=null && right!=null){
            if(left.data<right.data){
                newNode.next=left;
                left=left.next;
            }else{
                newNode.next=right;
                right=right.next;
            }
            curr=curr.next;
        }

        if(left!=null){
            curr.next=left;
        }
        if(right!=null){
            curr.next=right;
        }

        return newNode.next;
    }

    public static void main(String[] args) {
        Merge_k_sorted_lists_23 ll1=new Merge_k_sorted_lists_23();
        Merge_k_sorted_lists_23 ll2=new Merge_k_sorted_lists_23();
        Merge_k_sorted_lists_23 ll3=new Merge_k_sorted_lists_23();
        ll1.insertAtLast(1);
        ll1.insertAtLast(4);
        ll1.insertAtLast(5);
        ll2.insertAtLast(1);
        ll2.insertAtLast(3);
        ll2.insertAtLast(4);
        ll3.insertAtLast(2);
        ll3.insertAtLast(6);
        ll1.display(ll1.head);
        ll2.display(ll2.head);
        ll3.display(ll3.head);

        List<Node> lists=new LinkedList<>();
        lists.add(ll1.head);
        lists.add(ll2.head);
        lists.add(ll3.head);

        Merge_k_sorted_lists_23 ll4=new Merge_k_sorted_lists_23();
        Node head=ll4.mergeKLists(lists.toArray(lists.toArray(new Node[0])));
        ll4.display(head);
    }
}
