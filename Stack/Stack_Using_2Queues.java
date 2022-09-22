package Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_2Queues<T>
{
    //Define the data members
    private Queue<T> queue1;
    private Queue<T> queue2;
    private T peekEle;

    public Stack_Using_2Queues() {
        //Implement the Constructor
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
        peekEle=null;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return queue1.size();
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return queue1.isEmpty();
    }

    public void push(T element) {
        //Implement the push(element) function
        peekEle=element;
        queue1.add(element);
    }

    public T pop() throws Stack_EmptyException {
        //Implement the pop() function
        if (queue1.isEmpty()) throw new Stack_EmptyException();

        while(queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        T returnData=queue1.poll();

        while(!queue2.isEmpty()){
            peekEle=queue2.poll();
            queue1.add(peekEle);
        }
        return returnData;
    }

    public T top() throws Stack_EmptyException {
        //Implement the top() function
        if (queue1.isEmpty()) throw new Stack_EmptyException();
        return peekEle;
    }
}
