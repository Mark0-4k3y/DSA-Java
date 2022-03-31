package ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Remove_Duplicates
{
    public static void printList(ArrayList<Integer> list)
    {
        System.out.print("[ ");
        for(int ele:list){
            System.out.print(ele+" ");
        }System.out.print("]\n");
    }



    public static ArrayList<Integer> removeDuplicate(int[] arr)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[0]);

        for(int ele:arr){
            //Index of array list is given as:
            // index = list.size()-1;
            if (list.get(list.size()-1) != ele) list.add(ele);
        }

        return list;
    }


    public static void main(String[] args)
    {
        int[] arr={10, 10, 20, 20, 20, 30, 40, 50, 50, 60};
        ArrayList<Integer> list=removeDuplicate(arr);
        printList(list);
    }
}
