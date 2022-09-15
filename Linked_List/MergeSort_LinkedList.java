package Linked_List;
import java.util.Scanner;

public class MergeSort_LinkedList extends Linked_List_Basic
{

    public static Node<Integer> mergeSort(Node<Integer> head)
    {
        if (head.next==null || head==null) return head;

        //First I added this additional because in fast and slow approach I was using the statement which was not applicable for two length linked list.
//        if(head.next.next==null){
//            Node<Integer> secondHead=head.next;
//            head.next=null;
//            return mergeTwoSortedLinkedLists(mergeSort(head), mergeSort(secondHead));
//        }

        Node<Integer> fast=head;
        Node<Integer> slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        Node<Integer> secondHead=slow.next, firstHead=head;
        slow.next=null;

        firstHead=mergeSort(firstHead);
        secondHead=mergeSort(secondHead);
        head=mergeTwoSortedLinkedLists(firstHead, secondHead);
        return head;
    }


    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        System.out.println("Linked List before sorting: ");
        printLL2(head);

        head=mergeSort(head);
        System.out.println("Linked list after sorting: ");
        printLL2(head);
    }



    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2)
    {
        if(head1==null) return head2;
        if(head2==null) return head1;


        if(head1.data>head2.data){
            Node<Integer> temp=head2.next;
            head2.next=head1;
            head1=head2;
            head2=temp;
        }

        Node<Integer> pointer1=head1, pointer2=head2;
        Node<Integer> prev_Node=head1;

        while(pointer1!=null && pointer2!=null){
            if(pointer1.data <= pointer2.data){
                prev_Node=pointer1;
                pointer1=pointer1.next;
            }else{
                prev_Node.next=pointer2;
                pointer2=pointer2.next;
                prev_Node=prev_Node.next;
                prev_Node.next=pointer1;
            }
        }

        if(pointer2!=null){
            prev_Node.next=pointer2;
        }

        return head1;
    }
}
