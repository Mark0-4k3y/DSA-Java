package Linked_List;
import java.util.Scanner;

public class Increament_Every_Element  extends Linked_List_Basic
{
    public static void increament(Node<Integer> head, int incBy)
    {
        Node<Integer> temp=head;
        while(temp!=null){
            temp.data+=incBy;
            temp=temp.next;
        }
    }



    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        System.out.println("Enter the number by which you want to increase each element in linked list: ");
        int incBy=X.nextInt();

        Node<Integer> head=createLinkedList();
        printLL2(head);
        increament(head, incBy);
        printLL2(head);
    }
}
