package Linked_List;

import java.awt.*;

class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;

    DoubleNode(){

    }
    DoubleNode(Node<Integer> head, Node<Integer> tail){
        this.head=head;
        this.tail=tail;
    }
}

public class Recursion_ReverseLinkedLIst extends Linked_List_Basic
{
    public static Node<Integer> reverse_Rec(Node<Integer> head)
    {
        //Base Case
        if (head==null || head.next==null) return head;

        //Calling to the last node.
        Node<Integer> newHead=reverse_Rec(head.next);

        head.next.next=head;
        head.next=null;

        return newHead;
    }

    //Using tail method.
    public static Node<Integer> reverse_tail(Node<Integer> head)
    {
        if (head==null || head.next==null) return head;

        Node<Integer> newHead=reverse_tail(head.next);
        Node<Integer> tail=newHead;

        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        head.next=null;

        return newHead;
    }

    //Using double node class.
    public static DoubleNode reverse_DoubleNode(Node<Integer> head)
    {
        if (head==null || head.next==null){
            DoubleNode answer = new DoubleNode(head, head);
        }

        DoubleNode smallAnswer=reverse_DoubleNode(head.next);
        smallAnswer.tail.next=head;
        head.next=null;

        DoubleNode answer=new DoubleNode(smallAnswer.head, head);
//        answer.head=smallAnswer.head;
//        answer.tail=head;

        return answer;
    }


    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        head=reverse_tail(head);
        printLL2(head);
    }
}
