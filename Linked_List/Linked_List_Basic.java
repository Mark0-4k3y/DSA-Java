package Linked_List;

public class Linked_List_Basic
{

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
            System.out.print(tempH.data+" ");
            tempH=tempH.next;
        }
    }
    public static void printLL2H(Node<Integer> head)
    {
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }


    public static void main(String[] args)
    {
        Node<Integer> node1; //This will note create any node this is only creating a reference.
        node1=new Node<>(10); // This will create node/object;

        System.out.println(node1);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node<Integer> head=createLinkedList();
//        printLL1(head);
        printLL2(head);

        //The value of both head function is different for both the functions.
        //Function pass by value.
        System.out.println(head);
        printLL2H(head);
        System.out.println(head);
    }
}
