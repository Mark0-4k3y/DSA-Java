package PriorityQueues;
import java.util.ArrayList;

public class Implement_MaxPriorityQueues<G>
{
    private ArrayList<PriorityQueue_Element<G>> heap;
    public Implement_MaxPriorityQueues(){
        heap = new ArrayList<>();
    }

    public void insertElement(G value, int priority)
    {
        PriorityQueue_Element<G> ele=new PriorityQueue_Element<>(value, priority);
        heap.add(ele);

        int childIndex=heap.indexOf(ele);
        int parentIndex = (childIndex-1)/2;
        while(childIndex>0){

            if (heap.get(childIndex).priority > heap.get(parentIndex).priority){
                PriorityQueue_Element<G> temp=heap.get(parentIndex);
                heap.set(parentIndex, heap.get(childIndex));
                heap.set(childIndex, temp);

                //Updating the parent and child index.
                childIndex=parentIndex;
                parentIndex = (childIndex-1)/2;
            }else{
                return;
            }
        }
    }

    public G getMax() throws EmptyPriorityQueueException
    {
        if (isEmpty()) throw new EmptyPriorityQueueException();

        G value = heap.get(0).value;
        return value;
    }

    public void removeMax() throws EmptyPriorityQueueException
    {
        if (isEmpty()) throw new EmptyPriorityQueueException();

        PriorityQueue_Element lastEle=heap.get(size()-1);

        heap.set(0, lastEle); //Setting the last element in the place of min element, which is present at starting index.
        heap.remove(size()-1);//removing the element to maintain the heap order property.

        int parentIndex=0;
        int leftChildIndex=(parentIndex*2) + 1, rightChildIndex=(parentIndex*2) + 2;


        while(leftChildIndex < heap.size()){
            int maxIndex=parentIndex;
            if (heap.get(leftChildIndex).priority > heap.get(maxIndex).priority){
               maxIndex=leftChildIndex;
            }
            if(rightChildIndex < heap.size() && (heap.get(rightChildIndex).priority > heap.get(maxIndex).priority)){
                //First I here compared the right child index with size because what is the right child is not there in heap?!
              maxIndex=rightChildIndex;
            }

            if (maxIndex==parentIndex) break;

            PriorityQueue_Element temp=heap.get(maxIndex);
            heap.set(maxIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex=maxIndex;
            leftChildIndex=(parentIndex*2) + 1;
            rightChildIndex=(parentIndex*2) + 2;
        }
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size()==0;
    }
}
