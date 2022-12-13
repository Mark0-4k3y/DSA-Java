package PriorityQueues;

public class PriorityQueue_Element<G>
{
    G value;
    int priority;
    public PriorityQueue_Element(G value, int priority){
        this.value=value;
        this.priority=priority;
    }
}
