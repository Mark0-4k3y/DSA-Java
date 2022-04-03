package Linked_List;
import java.util.Scanner;

public class Delete_Node extends Linked_List_Basic
{
    //Function to delete the node:
    public static Node<Integer> deleteNode(Node<Integer> head, int pos)
    {
        if(head==null) return head;

        if(pos==0) return head.next;

        Node<Integer> temp=head;
        //Insted of temp!=null, I have used temp.next!=null because for the position greater than length this will work instead of temp!=null.
        while(temp.next!=null){
            if(pos==1){
                temp.next=temp.next.next;
                return head;
            }
            pos--;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();
        printLL2(head);

        System.out.println("Enter the nth position to delete the node: ");
        int position=X.nextInt();

        head=deleteNode(head, position);
        System.out.println("The linked list after the deletion operation is: ");
        printLL2(head);
    }
}
