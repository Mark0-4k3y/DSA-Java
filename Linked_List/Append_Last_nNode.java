package Linked_List;
import java.util.Scanner;

public class Append_Last_nNode extends Linked_List_Basic
{
    public static Node<Integer> append(Node<Integer> head, int nNodes)
    {
        if(head==null || nNodes==0) return head;

        int count=1;
        Node<Integer> lastNode=head;
        while(lastNode.next!=null){
            count++;
            lastNode=lastNode.next;
        }

        int run=0;
        while(run<(count-nNodes)){
            lastNode.next=head;
            lastNode=head;
            head=head.next;
        }
        return head;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();
        printLL2(head);
        head=append(head, 5);
        printLL2(head);
    }
}
