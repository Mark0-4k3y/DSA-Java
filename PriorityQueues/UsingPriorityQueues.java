package PriorityQueues;

public class UsingPriorityQueues
{
    public static void main(String[] args) throws EmptyPriorityQueueException {
        Implement_MaxPriorityQueues<String> maxPriorityQueue = new Implement_MaxPriorityQueues<>();
        maxPriorityQueue.insertElement("Faimly", 100);
        maxPriorityQueue.insertElement("Self Health", 99);
        maxPriorityQueue.insertElement("Mental Peace", 90);
        maxPriorityQueue.insertElement("Money", 93);

        System.out.println("\nSize of the queue before removing elements: "+maxPriorityQueue.size());
        while (!maxPriorityQueue.isEmpty()){
            System.out.println("The element with maximum priority of "+maxPriorityQueue.getMax());
//            if (maxPriorityQueue.isEmpty()) break;
            maxPriorityQueue.removeMax();
        }System.out.println("Size of the queue after removing elements: "+maxPriorityQueue.size()+"\n");


        Implement_MinPriorityQueues<String> minPriorityQueue = new Implement_MinPriorityQueues<>();
        minPriorityQueue.insertElement("Faimly", 100);
        minPriorityQueue.insertElement("Self Health", 99);
        minPriorityQueue.insertElement("Mental Peace", 90);
        minPriorityQueue.insertElement("Money", 93);

        System.out.println("\nSize of the queue before removing elements: "+minPriorityQueue.size());
        while (!minPriorityQueue.isEmpty()){
            System.out.println("The element with maximum priority: "+minPriorityQueue.getMin());
            minPriorityQueue.removeMin();
        }System.out.println("Size of the queue after removing elements: "+minPriorityQueue.size()+"\n");
    }
}
