package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Bubble_Sort extends Array_Class
{
    //Doing bubble sort using brute force
    public static void bubbleSortBF(int[] arr)
    {
        if (arr.length<=1) return;

        for(int loop=0; loop<arr.length; loop++){
            boolean isSorted=true;
            for (int ele=0; ele<arr.length-1; ele++){
                if (arr[ele]>arr[ele+1]){
                    int temp=arr[ele+1];
                    arr[ele+1]=arr[ele];
                    arr[ele]=temp;
                    isSorted=false;
                }
            }
            if (isSorted) return;
        }
    }

    //Doing Bubble sort using Recursion.
    public static void bubbleSortR(int[] arr)
    {
        if (arr.length<=1) return;
    }



    public static void main(String[] args)
    {
        int[] arr=Array_Class();
        printArray(arr);
        bubbleSortBF(arr);
        printArray(arr);
    }
}
