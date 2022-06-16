package Linked_List;

public class Recursion_InsertNode extends Linked_List_Basic
{
    public static Node<Integer> insertNode_R(Node<Integer> head, int position, int data)
    {
        if(head==null) return head;

        if(position==0){
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head;
            head=newNode;
            return head;
        }else{
            return insertNode_Rec(head, position, data);
        }
    }
    public static Node<Integer> insertNode_Rec(Node<Integer> head, int position, int data)
    {
        if(head==null && position<1) return head;

        if(position==0){
            Node<Integer> insertNode=new Node<>(data);
            insertNode.next=head;
            return insertNode;
        }else{
            head.next = insertNode_Rec(head.next, position-1, data);
            return head;
        }
    }

    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        head=insertNode_R(head, 4, 26);
        printLL2(head);
    }
}
