package Stack;
import Linked_List.Node;

public class Stack_UsingLinkedList<T>
{
    private Node<T> head;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
//        if (size==0) return true;
//        return false;
        return size == 0;
    }

    public void push(T element){
        Node<T> pushNode=new Node<>(element);

        if (head==null){
            head=pushNode;
        }else{
            pushNode.next=head;
            head=pushNode;
        }
        System.out.println(element+" has been pushed to stack!");
        size++;
    }

    public T top() throws Stack_EmptyException{
        if (head==null) throw new Stack_EmptyException();
        return head.data;
    }

    public void pop() throws Stack_EmptyException{
        if (head==null) throw new Stack_EmptyException();

        System.out.println(head.data+" is popped out from stack");
        head=head.next;
        size--;
    }

    public void print(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.println("[__"+temp.data+"__]");
            temp=temp.next;
        }
    }
}
