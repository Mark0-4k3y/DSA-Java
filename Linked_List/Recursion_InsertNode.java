package Linked_List;

public class Recursion_InsertNode extends Linked_List_Basic
{
    public static Node<Integer> insertNode_Rec(Node<Integer> head, int position, int data)
    {
        if(head==null && position>0) return head;

        if(position==0){
            Node<Integer> insertNode=new Node<>(data);
            insertNode.next=head;
            return insertNode;
        }

        head.next = insertNode_Rec(head.next, position-1, data);
        return head;

    }


    public static void insertNode(Node<Integer> head, int position, int data)
    {
        if (head==null) return;
        if (position==0) {
            Node<Integer> newNode=new Node<Integer>(head.data);
            newNode.next=head.next;
            head.data=data;
            head.next=newNode;
            return;
        }

        if (position==1){
            Node<Integer> newNode=new Node<>(data);
            newNode.next=head.next;
            head.next=newNode;
            return;
        }

        insertNode(head.next, position-1, data);
    }


    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        head=insertNode_Rec(head, 4, 26);
//        insertNode(head, 2, 26);
        printLL2(head);
    }
}
