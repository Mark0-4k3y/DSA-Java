package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Merge_Sort extends Array_Class
{
    //Doing Merging on two sorted arrays. without using recursion.
    public static int[] merge(int[] arr1, int[] arr2)
    {
        //If one of the array is sorted than I will simply return the arrays as it is.

        int[] arr=new int[arr1.length+arr2.length];
        int ind1=0, ind2=0, ind=0;

        //Now Comparing and arranging the numbers in array.
        while(ind1<arr1.length && ind2<arr2.length){
            if(arr1[ind1]<=arr2[ind2]){
                arr[ind]=arr1[ind1];
                ind++;
                ind1++;
            }else{
                arr[ind]=arr2[ind2];
                ind2++;
                ind++;
            }
        }

        //If the value are remained in array 1 or 2 then;
        while(ind1<arr1.length){
            arr[ind]=arr1[ind1];
            ind++;
            ind1++;
        }
        while(ind2<arr2.length){
            arr[ind]=arr2[ind2];
            ind++;
            ind2++;
        }
        return arr;
    }

    //Doing Merge sort on unsorted array using recursion.
    public static int[] mergeSort(int[] arr)
    {
        if (arr.length<=1) return arr;

        int mI=arr.length/2;

        //Converting the arr into two new arrays(arr1 and arr2).
        int[] arr1=new int[mI];
        for (int i=0; i<mI; i++){
            arr1[i]=arr[i];
        }

        int[] arr2=new int[arr.length-mI];
        for (int i=0; i<arr2.length; i++){
            arr2[i]=arr[i+mI];
        }

        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);

        arr=merge(arr1, arr2);
        return arr;
    }




    public static void main(String[] args)
    {
        //Both the arrays should be sorted for the function which is done without recursion.
        int[] arr0= Array_Class();
        int[] arr1=Array_Class();
        printArray(arr0);
        printArray(arr1);

//        int[] sortedArray=merge(arr0, arr1);
//        printArray(sortedArray);

        arr0=mergeSort(arr0);
        arr1=mergeSort(arr1);
        int[] sorted=merge(arr0, arr1);
        printArray(sorted);

//        int[] arr=Array_Class();
//        printArray(arr);
//        int[] sortedArr=mergeSort(arr);
//        printArray(sortedArr);
    }
}
