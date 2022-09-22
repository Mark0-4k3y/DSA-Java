package Queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseQueue_InItself
{
    public static void reverseQueue(Queue<Integer> queue)
    {
        if (queue.size()<=1) return;

        int data=queue.poll();
        reverseQueue(queue);
        queue.add(data);
    }

    public static void main(String[] args)
    {
        Queue<Integer> queue=new LinkedList<>();
        Scanner X=new Scanner(System.in);

        System.out.println("Enter the data to enqueue, else -1: ");
        int input=X.nextInt();
        while(input!=-1){
            queue.add(input);

            System.out.println("Enter the data to enqueue: ");
            input=X.nextInt();
        }

        reverseQueue(queue);
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+"<-");
        }
    }
}
