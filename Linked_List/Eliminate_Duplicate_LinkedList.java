package Linked_List;

import java.util.Scanner;

public class Eliminate_Duplicate_LinkedList extends Linked_List_Basic
{
    public static Node<Integer> removeDuplicates(Node<Integer> head)
    {
        if(head==null || head.next==null) return head;

        Node<Integer> temp=head;
        while(temp.next!=null){
            if(temp.data.equals(temp.next.data)){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;
    }

    // == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();
        printLL2(head);
        head=removeDuplicates(head);
        printLL2(head);
    }
}
