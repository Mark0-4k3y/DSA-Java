package Linked_List;
import java.util.Scanner;
public class Linked_List_Basic
{

    public static Scanner X=new Scanner(System.in);

    public static Node createLinkedList()
    {
        Node<Integer> node1=new Node<>(10);

        Node<Integer> node2=new Node<>(20);
        node1.next=node2;

        Node<Integer> node3=new Node<>(30);
        node2.next=node3;

        Node<Integer> node4=new Node<>(40);
        node3.next=node4;

        return node1;
    }

    public static void printLL1(Node head)
    {
        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
    }

    public static void printLL2(Node<Integer> head)
    {
        Node<Integer> tempH=head;
            while(tempH!=null){
                System.out.print(tempH.data+" -> ");
                tempH=tempH.next;
            }
            System.out.print("null\n");
    }
    public static void printLL2H(Node<Integer> head)
    {
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }


    public static void numberOfNodes(Node<Integer> head)
    {
        int count=0;
        Node<Integer> temp=head;
        while (temp!=null){
            count+=1;
            temp=temp.next;
        }
        System.out.println("Number of nodes in linked list is: "+count);
    }


    //Function which will take input of a linked list
    public static Node<Integer> takeInput1()
    {
        Node<Integer> head=null;
        Node<Integer> lastNode=null;

        System.out.println("Enter the data for the node, and enter -1 to exit: ");
        int data=X.nextInt();

        while(data!=-1){

            Node<Integer> newNode=new Node<>(data);

            if (head==null){
                //Make newNode as Head.
                head=newNode;
                lastNode=newNode;
                //We store the value of same node in address so that head.next will not be null next time.
//                lastNode.next=newNode;
            }else{
                lastNode.next=newNode;
                lastNode=newNode;
            }

            System.out.println("Enter the data for the node: ");
            data= X.nextInt();
        }
        System.out.println("Data insertion complete for the linked list!\n");
        return head;
    }

    public static void main(String[] args)
    {
        Node<Integer> node1; //This will note create any node this is only creating a reference.
//        node1=new Node<>(10); // This will create node/object;
//
//        System.out.println(node1);
//        System.out.println(node1.data);
//        System.out.println(node1.next);
//
//        Node<Integer> head=createLinkedList();
////        printLL1(head);
//        printLL2(head);
//
//        //The value of both head function is different for both the functions.
//        //Function pass by value.
//        System.out.println(head);
//        printLL2H(head);
//        System.out.println(head);
//        numberOfNodes(head);

        Node<Integer> linkedList=takeInput1();
        printLL2(linkedList);
    }
}
