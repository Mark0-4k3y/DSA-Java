package Queue;

public class Queue_LinkedList_Implemented
{
    public static void main(String[] args) throws QueueEmptyException {
        Queue_Using_LinkedList<Integer> queue=new Queue_Using_LinkedList<>();

        System.out.println("Is queue Empty? "+queue.isEmpty());
        System.out.println("Size of the queue is: "+queue.size());

        int data=10;
        for (int i=0; i<10; i++){
            queue.enqueue(data);
            data+=10;
        }

        System.out.println("Is queue Empty? "+queue.isEmpty());
        System.out.println("Size of the queue is: "+queue.size());
        System.out.println("Front element of the queue is? "+queue.front());

        queue.dequeue();
        queue.dequeue();
        System.out.println("Is queue Empty? "+queue.isEmpty());
        System.out.println("Size of the queue is: "+queue.size());
        System.out.println("Front element of the queue is? "+queue.front());

    }
}
