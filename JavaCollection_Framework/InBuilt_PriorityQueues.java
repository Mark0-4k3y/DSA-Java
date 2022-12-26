package JavaCollection_Framework;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class InBuilt_PriorityQueues
{
    public static void main(String[] args)
    {
        int[] arr={10, 5, 7, 1, 9, 13, 15, 6, 2, 3, 8};

        //By default the priority queue is min priority queue.
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        //Adding elements to the queue.
        for(int ele:arr) pq.add(ele);

//        //Checking element present at the peek, two functions available;
//        System.out.println(pq.element());
//        System.out.println("Element present at the peek is: "+pq.peek());
//        //The difference is when the queue is empty element() return error, while peek() return null.
//
//
//        //We use poll to remove element from the queue.
//        System.out.println(pq.poll());
//
//        //checking is empty condition.
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
////        System.out.println(pq.element());
//        System.out.println("Element present at the peek is: "+pq.peek());



        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        String[] strArray = {"Hello", "How are you?", "What is your name?", "My name is.", "Apple", "Banana", "Keshav", "Tyagi", "Vashishth"};

        for(String words:strArray) stringPQ.add(words);
        while(!stringPQ.isEmpty()){
            System.out.println(stringPQ.poll());
        }




        //Making max priority queue using Collection.reverseOrder();
        PriorityQueue<Integer> maxPQ=new PriorityQueue<>(Collections.reverseOrder());

        //Adding elements to the queue.
        for(int ele:arr) maxPQ.add(ele);
        //checking is empty condition.
        while(!maxPQ.isEmpty()){
            System.out.println(maxPQ.poll());
        }

    }
}
