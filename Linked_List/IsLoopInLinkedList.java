package Linked_List;

public class IsLoopInLinkedList extends Linked_List_Basic
{
    //
    public static boolean detectLoop(Node head)
    {
        Node oneHopNode=head;
        Node twoHopNode=head;
        while(oneHopNode!=null && (twoHopNode!=null && twoHopNode.next!=null)){
            oneHopNode=oneHopNode.next;
            twoHopNode=twoHopNode.next.next;
            if(oneHopNode==twoHopNode) return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Node<Integer> head=createLinkedList();
        printLL2(head);
        System.out.println("Is loop present in linkedlist?: "+detectLoop(head));
    }

}
