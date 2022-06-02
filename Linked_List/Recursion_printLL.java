package Linked_List;

import java.util.Scanner;

public class Recursion_printLL extends Linked_List_Basic
{
    public static void printLL_R(Node<Integer> head)
    {
        if (head==null) return;
        System.out.print(head.data+"->");
        printLL_R(head.next);
    }

    public static void printRevLL_R(Node<Integer> head)
    {
        if (head==null) return;
        printRevLL_R(head.next);
        System.out.print(head.data+"->");
    }


    public static void main(String[] args)
    {
        Scanner X=new Scanner(System.in);
        Node<Integer> head=takeInput1();

        printLL_R(head);
        System.out.print("@null\n");

        printRevLL_R(head);
        System.out.print("@null\n");
    }
}
