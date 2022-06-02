package Linked_List;

import java.util.Scanner;

public class Reverse_LinkedList extends Linked_List_Basic
{
    //Dry run it once, it will be amazing to dry run it
    public static Node<Integer> reverseLL(Node<Integer> head)
    {
        if(head==null || head.next==null) return head;

        Node<Integer> curNode=head.next;
        Node<Integer> preNode=head;
        Node<Integer> nextNode=curNode.next;

        preNode.next=null;
        while(nextNode!=null){
            curNode.next=preNode;
            preNode=curNode;
            curNode=nextNode;
            nextNode=nextNode.next;
        }
        curNode.next=preNode;
        return curNode;

//        Mistake Area: earlier
//        while(nextNode.next!=null){
//            curNode.next=preNode;
//            preNode=curNode;
//            curNode=nextNode;
//            nextNode=nextNode.next;
//        }
//        nextNode.next=curNode;
//        return nextNode;
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();
        printLL2(head);
        head=reverseLL(head);
        printLL2(head);
    }
}
