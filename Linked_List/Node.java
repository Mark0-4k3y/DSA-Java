package Linked_List;

public class Node<G>
{
    public G data;
    public Node next;

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
