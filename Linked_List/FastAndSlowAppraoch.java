package Linked_List;

public class FastAndSlowAppraoch
{
//    Floyd’s cycle finding algorithm or Hare-Tortoise algorithm is a pointer algorithm that uses only two pointers, moving through the sequence at different speeds.
//    This algorithm is used to find a loop in a linked list. It uses two pointers one moving twice as fast as the other one.
//    The faster one is called the faster pointer and the other one is called the slow pointer.
    //Fast and Slow approach to find the middle one.
    public static Node<Integer> middle(Node<Integer> head)
    {
        Node<Integer> fast=head;
        Node<Integer> slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
