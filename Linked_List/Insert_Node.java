package Linked_List;
import java.util.Scanner;
public class Insert_Node extends Linked_List_Basic
{
    public static Node<Integer> insert(Node<Integer> head, int data, int pos)
    {
        //Creating the inserting node.
        Node<Integer> insertNode=new Node<Integer>(data);

        //If I have to place the inserting node in starting.
        if(pos==0){
            insertNode.next=head;
            head=insertNode;
            return head;
        }

        //Inserting node at ith position.
        Node<Integer> temp=head;
        while(temp!=null){
            if(pos==1){
                insertNode.next=temp.next;
                temp.next=insertNode;
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

        System.out.println("Enter the data and the position for inserting the data:");
        int data=X.nextInt(), position=X.nextInt();

        System.out.println("Before Inserting: ");
        printLL2(head);
        head=insert(head, data, position);

        System.out.println("After Inserting: ");
        printLL2(head);

    }
}
