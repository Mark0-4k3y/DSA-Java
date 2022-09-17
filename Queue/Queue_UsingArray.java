package Queue;

public class Queue_UsingArray
{
    private int[] queue;
    private int frontEnd;//Index of the element present at the front end.
    private int rearEnd;//Index of the element present at the rear end.
    private int size;

    public Queue_UsingArray()
    {
        queue=new int[5];
        frontEnd=-1;
        rearEnd=-1;
        size=0;
    }
    public Queue_UsingArray(int capacity)
    {
        queue=new int[capacity];
        frontEnd=-1;
        rearEnd=-1;
        size=0;
    }


    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size == 0);
    }

    public void enqueue(int data) throws QueueLimitOutOfBound {
        if (rearEnd>=queue.length-1){
            throw new QueueLimitOutOfBound();
        }

        if (frontEnd == -1){
            queue[++frontEnd]=data;
            rearEnd++;
        }else{
            queue[++rearEnd]=data;
        }
        size++;
    }

    public void dequeue() throws QueueEmptyException {
        if (frontEnd==-1){
            throw new QueueEmptyException();
        }
        System.out.println(queue[frontEnd]+" element is dequeued");
        queue[frontEnd]=0;
        frontEnd++;
        size--;
        //When the size of the queue becomes 0.
        if (size==0){
            frontEnd=-1;
            rearEnd=-1;
        }
    }

    public int front()
    {
        return queue[frontEnd];
    }

    public void print()
    {
        for(int data:queue){
            System.out.print(data+"<-");
        }System.out.println("\n");
    }
}
