package PriorityQueues;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;
public class kSmallestElements
{
    public static ArrayList<Integer> kSmallest(int[] arr, int k)
    {
        PriorityQueue<Integer> maxPq=new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements to the queue.
        for(int index=0; index<k; index++){
            maxPq.add(arr[index]);
        }

        for(int index=k; index<arr.length; index++){
            if(maxPq.peek() > arr[index]){
                maxPq.poll();
                maxPq.add(arr[index]);
            }
        }

        ArrayList<Integer> list=new ArrayList<>();
        int times=k;
        while(times > 0){
            list.add(maxPq.poll());
            times--;
        }

        return list;
    }

    public static void main(String[] args)
    {
        int[] arr={2,12,9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        ArrayList<Integer> kSmallest = kSmallest(arr, 5);
        for(int ele:kSmallest) System.out.print(ele+" ");
    }
}



// This method has sapce complexity of O(n) and we need O(k).
// This method has time complexity of O(nlogn) and we need O(nlogk).

// public static ArrayList<Integer> kSmallest(int n, int[] arr, int k)
// 	{
// 		PriorityQueue<Integer> pq=new PriorityQueue<>();

//         //Adding elements to the queue.
//         for(int ele:arr) pq.add(ele);

// 		ArrayList<Integer> list=new ArrayList<>();
// 		int times=k;
// 		while(times>0){
// 			list.add(pq.poll());
// 			times--;
// 		}

// 		return list;
// 	}
