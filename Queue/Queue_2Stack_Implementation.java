package Queue;

public class Queue_2Stack_Implementation
{
    public static void main(String[] args) throws QueueEmptyException {
        Queue_Using_2Stacks<Integer> queue=new Queue_Using_2Stacks<Integer>();
        System.out.println("Size of the queue is: "+queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Size of the queue is: "+queue.size());
        System.out.println("Front element of the queue is: "+queue.front());

        System.out.println(queue.dequeue()+" element has been dequeued.");
        System.out.println("Front element of the queue is: "+queue.front());
        System.out.println("Size of the queue is: "+queue.size());

    }
}
