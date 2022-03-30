package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Introduction
{
    public static void main(String[] args)
    {
        //Creating an Array List.
        ArrayList<Integer> arr=new ArrayList<>();

        //add() function will add the element to list in increasing index order.
        arr.add(10);
        arr.add(20);
        arr.add(30);

        //get(i) function will return the element present at ith index.
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        //add(index, element) will add element at particular index and shift the other elements to the right.
        arr.add(1, 26);
        System.out.println(arr.get(1));

        //size() function will define the size of the Array List.
        System.out.println(arr.size());
    }
}
