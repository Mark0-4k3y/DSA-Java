package Linked_List;

public class Recursion_InsertNode extends Linked_List_Basic
{
    public static void insertNode_R(Node<Integer> head, int position, int data)
    {
        if (head==null) return;
        if (position==0){
            Node<Integer> insertNode=new Node<>(data);
            insertNode.next=head;
            head=insertNode;
        }
        if (position==1){
            Node<Integer> insertNode=new Node<>(data);
            insertNode.next=head.next;
            head.next=insertNode;
            return;
        }else{
            insertNode_R(head.next, position-1, data);
        }
    }

    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        insertNode_R(head, 0, 26);
        printLL2(head);
    }
}
