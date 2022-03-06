package Recursion.Searching_AND_Sorting;
import java.util.Scanner;

public class Merge_Sort extends Array_Class
{
    //Doing Merge Sort without using recursion.
    public static int[] mergeSortBF(int[] arr1, int[] arr2)
    {
        //If one of the array is sorted than I will simply return the arrays as it is.
        if (arr1.length<=0) return arr2;
        if (arr2.length<=0) return arr1;

        int indexArr1=0, indexArr2=0;
        int[] arr=new int[arr1.length+arr2.length];
        int index=0;

        //Now comparing the elements from both the arrays and then place them in the new array.
        while(indexArr1<arr1.length && indexArr2<arr2.length){
            if (arr1[indexArr1]<arr2[indexArr2]){
                arr[index]=arr1[indexArr1];
                index++;
                indexArr1++;
            }else {
                arr[index]=arr2[indexArr2];
                index++;
                indexArr2++;
            }
        }

        //If the value are remained in array 1 or 2 then;
        while(indexArr1<arr1.length){
            arr[index]=arr1[indexArr1];
            index++;
            indexArr1++;
        }
        while(indexArr2<arr2.length){
            arr[index]=arr2[indexArr2];
            index++;
            indexArr2++;
        }

        return arr;
    }


    public static void main(String[] args)
    {
        int[] arr= Array_Class();
        int[] arr1=Array_Class();
        printArray(arr);
        printArray(arr1);

        int[] sortedArray=mergeSortBF(arr, arr1);
        printArray(sortedArray);
    }
}
