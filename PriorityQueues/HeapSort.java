package PriorityQueues;

public class HeapSort
{
    //Not good time complexity.
    public static void inplaceHeapSort1(int heap[])
    {
        //1. First I will make a heap using upheapify operation.
        for(int childIndex=1; childIndex<heap.length; childIndex++){
            int parentIndex = (childIndex-1)/2;
            while(childIndex > 0 && heap[childIndex] < heap[parentIndex]){

                int temp=heap[childIndex];
                heap[childIndex]=heap[parentIndex];
                heap[parentIndex]=temp;

                //Updating the index
                childIndex=parentIndex;
                parentIndex = (childIndex-1)/2;
            }
        }

        //2. Second I will remove and apply down heapify operation.
        for(int lastIndex = heap.length-1; lastIndex >= 0; lastIndex--){
            int temp = heap[0];
            heap[0] = heap[lastIndex];
            heap[lastIndex] = temp;
            downHeapify(heap,0, lastIndex-1);
        }
    }

    //Good Time complexity.
    public static void inplaceHeapSort2(int heap[])
    {
        // 1. First I will make it a heap.
        //Finding the number od non leaf nodes ((n/2)-1);
        int nonLeafNodes = (heap.length/2) - 1;
        for(int nodeIndex = nonLeafNodes; nodeIndex >= 0; nodeIndex--){
            //Now I have to apply down heapify operation.
            downHeapify(heap, nodeIndex, heap.length-1);
        }

        //2. Now I will remove elements from the heap.
        for(int lastIndex = heap.length-1; lastIndex >= 0; lastIndex--){
            int temp = heap[0];
            heap[0] = heap[lastIndex];
            heap[lastIndex] = temp;
            downHeapify(heap,0, lastIndex-1);
        }
    }
    private static void downHeapify(int[] heap,int si, int ei)
    {
        int parentIndex = si;
        int leftChildIndex = (parentIndex*2) + 1;
        int rightChildIndex = leftChildIndex + 1;

        while(leftChildIndex <= ei){

            int minIndex = parentIndex;
            if(heap[leftChildIndex] < heap[minIndex]){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex <= ei && heap[rightChildIndex] < heap[minIndex]){
                minIndex = rightChildIndex;
            }

            if (minIndex == parentIndex) break;

            int temp = heap[minIndex];
            heap[minIndex] = heap[parentIndex];
            heap[parentIndex] = temp;

            //Updating the indexes;
            parentIndex = minIndex;
            leftChildIndex = (parentIndex * 2) + 1;
            rightChildIndex = leftChildIndex + 1;
        }
    }


    public static void main(String[] args)
    {
        int[] arr={10, 5, 11, 2, 3, 7, 12, 1, 6};

//        inplaceHeapSort1(arr);
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }System.out.println(" ");

        inplaceHeapSort2(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }System.out.println(" ");
    }
}
