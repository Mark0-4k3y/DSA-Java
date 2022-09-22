package Queue;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Reverse_firstK
{
    public static void reverseFirstK(Queue<Integer> queue, int k)
    {
        if (queue.isEmpty() || k>=queue.size()) return;

        reverseKElements(queue, k);
        int times=0;
        while(times!=queue.size()-k){
            queue.add(queue.poll());
            times++;
        }
    }
    private static void reverseKElements(Queue<Integer> queue, int k)
    {
        if(queue.size()<=1 || k<=0) return;

        int data=queue.poll();
        reverseKElements(queue, k-1);
        queue.add(data);
    }



    //Using stack.
    public static void ReverseK_UsingStacks(Queue<Integer> queue, int k)
    {
        if (queue.isEmpty() || k>=queue.size()) return;

        Stack<Integer> stack=new Stack<>();
        while(k>0){
            stack.push(queue.poll());
            k--;
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for (int i=0; i<queue.size()-k; i++){
            queue.add(queue.poll());
        }
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

        System.out.println("Enter the K value for reverse the first K elements");
        int k=X.nextInt();
        X.close();
        reverseFirstK(queue, k);
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+"<-");
        }
    }
}
