package Linked_List;

public class SwapNodes extends Linked_List_Basic
{
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j)
    {

        if(head==null || head.next==null) return head;

        Node<Integer> prevHead=head;
        for(int jump=1; jump<i; jump++){
            prevHead=prevHead.next;
        }

        Node<Integer> temp=prevHead.next;
        prevHead.next=prevHead.next.next;
        prevHead=prevHead.next;
        temp.next=prevHead.next;
        prevHead.next=temp;

        return head;
    }


    public static void main(String[] args)
    {
        Node<Integer> head=takeInput1();
        printLL2(head);

        System.out.println("Enter the ith and jth node you want to swap from linked list: ");
        int ith=X.nextInt();
        int jth=X.nextInt();

        head=swapNodes(head,ith,jth);
        System.out.println("Linked list after swapping the "+ith+" and "+jth+" node.");
        printLL2(head);
    }
}
