package Linked_List;
import java.util.Scanner;

public class Merge_TwoSorted_LinkedList extends Node
{
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


    public static void main(String[] args)
    {

    }
}
