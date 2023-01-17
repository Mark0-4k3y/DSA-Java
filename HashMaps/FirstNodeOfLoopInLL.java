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
}
