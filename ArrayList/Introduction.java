package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Introduction
{
    public static void printList(ArrayList<Integer> list)
    {
        System.out.print("[ ");
        for(int ele:list){
            System.out.print(ele+" ");
        }System.out.print("]\n");
    }

    public static void main(String[] args)
    {
        //Creating an Array List.
        ArrayList<Integer> arr=new ArrayList<>();

        //add() function will add the element to list in increasing index order.
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        printList(arr);

        //get(i) function will return the element present at ith index.
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));


        //add(index, element) will add element at particular index and shift the other elements to the right.
        arr.add(1, 26);
        System.out.println(arr.get(1));
        printList(arr);

        //size() function will define the size of the Array List.
        System.out.println(arr.size());

        //remove(index or object) removes the element from the list and shift remain elements to the left by one.
        System.out.println("\nRemove Function: "+arr.get(1));
        arr.remove(1);
        System.out.println(arr.get(1));
        Integer object=30;
        arr.remove(object);
        printList(arr);
//        System.out.println(arr.get(2));

        //set(index, element) used to replace the element.
        arr.set(0, 100);
        System.out.println("\nSet Function: "+arr.get(0)+"\n");
        printList(arr);
    }
}
