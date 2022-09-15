package JavaCollection_Framework;
import java.util.LinkedList;

public class Linked_List
{
    public static void main(String[] args)
    {
        //This will make a doubly linked list.
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);//This add to the last of linked list.
        list.add(30);
        list.addFirst(0);//This add to first of linked list.

        //Return the element present at inserted index.
        System.out.println(list.get(1));

        //Return the size of linked list.
        System.out.println(list.size());
        print(list);

        //Replace the element at given index and add another data.
        list.set(0, -10);
        print(list);

        //Remove the element from the starting.
        list.remove();
        print(list);

        //Remove the element from the last.
        list.removeLast();
        print(list);
    }

    public static void print(LinkedList<Integer> list)
    {
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}
