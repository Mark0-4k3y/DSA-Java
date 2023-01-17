package HashMaps;
import java.util.HashMap;

class Node
{
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}


public class FirstNodeOfLoopInLL
{
    public static int findFirstNode(Node head)
    {
        HashMap<Node, Integer> map=new HashMap<>();
        Node tempHead=head;
        while(tempHead!=null){
            if(map.containsKey(tempHead)) return tempHead.data;
            map.put(tempHead, 1);
            tempHead=tempHead.next;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Node head=new Node(1);
        int num=2;
        Node tail=head;
        while(num<=5){
            Node nextNode=new Node(num);
            tail.next=nextNode;
            tail=nextNode;
            num++;
        }

        //Making a loop.
        tail.next=head.next.next;//(Loop: 5 -> 3)
        System.out.println("The first node of the loop is: "+findFirstNode(head));
    }
}
