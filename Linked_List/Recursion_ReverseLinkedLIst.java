package Linked_List;

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


    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        head=reverse_Rec(head);
        printLL2(head);
    }
}
