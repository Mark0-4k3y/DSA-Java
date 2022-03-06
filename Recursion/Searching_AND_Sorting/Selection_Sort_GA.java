package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Selection_Sort_GA extends Array_Class
{
    //Doing Selection sort using the Brute force method or without recursion
    public static void selectionSort(int[] arr)
    {
        if (arr.length==1) return;

        for (int round=0; round<arr.length-1; round++){
            int minEle=arr[round], minEleI=round;

            for (int ele=round+1; ele<arr.length; ele++){
                //Comparing the elements for finding the smallest Element.
                if (minEle>arr[ele]) {
                    minEleI=ele;
                    minEle=arr[ele];
                }
            }

            //Swapping the smallest element to the respective indexes.
            int temp=arr[round];
            arr[round]=minEle;
            arr[minEleI]=temp;
        }
    }


    //Doing selection sort using recursion.
    public static void selectionSortR(int[] arr)
    {

    }



    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
