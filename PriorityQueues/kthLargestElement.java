package PriorityQueues;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElement
{
    public static int kthLargest(int[] arr, int k)
    {

        if(k > arr.length) return -1;

        PriorityQueue<Integer> minpq = new PriorityQueue<>();

        for(int index=0; index<k; index++){
            minpq.add(arr[index]);
        }

        for(int index=k; index<arr.length; index++){
            if(minpq.peek() < arr[index]){
                minpq.poll();
                minpq.add(arr[index]);
            }
        }

        return minpq.poll();
    }

    public static void main(String[] args)
    {
        int[] arr={2,12,9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};

        Scanner X=new Scanner(System.in);

        System.out.println("Enter the kth largest number: ");
        int nth=X.nextInt();

        int kthLargest = kthLargest(arr, nth);
        System.out.println("The "+nth+"th largest element from the arrays is: "+kthLargest);
    }
}
