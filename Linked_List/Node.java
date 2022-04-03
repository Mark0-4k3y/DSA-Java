package Linked_List;
import java.util.Scanner;

public class Node<G>
{
    G data;
    Node next;

    public Node(G data)
    {
        this.data=data;
        next=null;
    }

    public Node()
    {
        next=null;
    }
}
