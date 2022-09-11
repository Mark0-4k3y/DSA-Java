package Linked_List;

public class Recursion_Delete_Node extends Linked_List_Basic
{
    public static Node<Integer> deleteNode_Rec(Node<Integer> head, int pos)
    {
        if(head==null || pos<0) return head;

        if(pos==0){
            return head.next;
        }

        head.next=deleteNode_Rec(head.next, pos-1);
        return head;
    }

    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        deleteNode_Rec(head, 2);
        printLL2(head);
    }
}
