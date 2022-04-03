package Linked_List;
import java.util.Scanner;

public class Print_ith_Node extends Linked_List_Basic
{
    public static void print_i_th(Node<Integer> head, int ith)
    {
        Node temp=head;
        while(temp!=null){
            if (ith==0) {
                System.out.println("The ith node is: "+temp.data);
                break;
            }
            ith--;
            temp=temp.next;
        }
    }

    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the ith number to print the ith node: ");
        int ith=X.nextInt();
        Node<Integer> head=createLinkedList();
        print_i_th(head, ith);
    }
}
