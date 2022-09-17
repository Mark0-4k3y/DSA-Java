package Queue;

public class QueueArray_Implementation
{
    public static void main(String[] args) throws QueueEmptyException, QueueLimitOutOfBound {
        Queue_UsingArray queue=new Queue_UsingArray();
//        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.print();
        System.out.println("what is the size of the queue? "+queue.size());

        queue.dequeue();
        queue.print();

        //Result of circular queue.
        queue.enqueue(10);
        queue.print();

        System.out.println("Is queue empty? "+queue.isEmpty());
        System.out.println("what is the size of the queue? "+queue.size());
        System.out.println("Which element is present at he front of the queue? "+queue.front());
    }
}
