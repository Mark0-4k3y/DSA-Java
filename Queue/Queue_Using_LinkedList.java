package Queue;
import Linked_List.Node;

public class Queue_Using_LinkedList<T> extends Node
{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public Queue_Using_LinkedList(){
        this.head=null;
        this.tail=null;
        size=0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void enqueue(T data)
    {
        Node<T> insertData=new Node<>(data);
        if (head==null){
            head=insertData;
            tail=insertData;
        }else{
            tail.next=insertData;
            tail=insertData;
        }
        size++;
    }

    public void dequeue() throws QueueEmptyException
    {
        if (size==0) throw new QueueEmptyException();

        System.out.println(head.data+" has been dequeued!");
        head=head.next;
        size--;
    }

    public T front() throws QueueEmptyException
    {
        if (size==0) throw new QueueEmptyException();
        return head.data;
    }
}
