package Queue;
import java.util.Queue;
import java.util.Stack;
public class Queue_Using_2Stacks <T>
{
    private Stack<T> stack1;
    private Stack<T> stack2;
    private T frontEle;

    public Queue_Using_2Stacks()
    {
        stack1=new Stack<>();
        stack2=new Stack<>();
        frontEle=null;
    }

    public int size(){
        return stack1.size();
    }
    public boolean isEmpty()
    {
        return stack1.isEmpty();
    }

    public void enqueue(T data)
    {
        if (frontEle==null) frontEle=data;
        stack1.push(data);
    }

    public T dequeue() throws QueueEmptyException
    {
        if (stack1.isEmpty()) throw new QueueEmptyException();

        while(stack1.size()!=1){
            stack2.push(stack1.pop());
        }
        T data=stack1.pop();

        frontEle=stack2.peek();

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return data;
    }

    public T front() throws QueueEmptyException
    {
        if (stack1.isEmpty()) throw new QueueEmptyException();
        return frontEle;
    }
}
