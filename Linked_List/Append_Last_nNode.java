package Linked_List;
import java.util.Scanner;

public class Append_Last_nNode extends Linked_List_Basic
{
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n)
    {
        if(head==null || head.next==null || n==0) return head;

        Node<Integer> lastNode=head;
        int noOfNodes=1;
        //I have to take the lastNode.next!= null isted of lastNdde!=null.
        //Because in lastNode!=null, lastNode reach to the null node.
        while(lastNode.next!=null){
            noOfNodes++;
            lastNode=lastNode.next;
        }

        if(n==noOfNodes){
            return head;
        }

        if(n>noOfNodes) n=n-noOfNodes;
        int rounds=noOfNodes-n;

        Node<Integer> temp=head;
        while(rounds!=0){
            lastNode.next=temp;
            lastNode=temp;
            temp=temp.next;
            lastNode.next=null;
            rounds--;
        }
        return temp;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();
        printLL2(head);
        head=appendLastNToFirst(head, 5);
        printLL2(head);
    }
}
