package JavaCollection_Framework;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Interface
{
    public static void main(String[] args)
    {
        //Queue in java collection is present as an Interface, its not a class in java.
        //So we can make reference of the queue but not make a object of it.
//    Queue<Integer> temp; //This will not throw any error.
//    Queue<Integer> temp=new Queue<Integer>(); //Show error.

        //Now to implement queue, I have to use the class which already implemented the queue.
        //Linked list is the class which already implemented the queue data structure.

        Queue<Integer> queue=new LinkedList<Integer>();


        System.out.println("Is queue Empty? "+queue.isEmpty());

        //Add element to queue.
        queue.add(10);
        queue.add(20);

        System.out.println("Size of the queue is: "+queue.size());
        System.out.println("Element present at the front/top/peek of the queue is: "+queue.peek());
        System.out.println("Element which dequeued from the queue is: "+queue.poll());
    }
}
