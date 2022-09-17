package Queue;

public class QueueArray_Implementation
{
    public static void main(String[] args) throws QueueEmptyException, QueueLimitOutOfBound {
        Queue_UsingArray queue=new Queue_UsingArray(3);
//        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Is queue empty? "+queue.isEmpty());
        System.out.println("what is the size of the queue? "+queue.size());
        System.out.println("Which element is present at he front of the queue? "+queue.front());

        print(queue);
        System.out.println("what is the size of the queue? "+queue.size());

    }

    public static void print(Queue_UsingArray queue ) throws QueueEmptyException {
            Queue_UsingArray tempQueue=queue;
            while (!tempQueue.isEmpty()){
                tempQueue.dequeue();
            }
    }
}
